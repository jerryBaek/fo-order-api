/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * smlee1@kyobobook.com           2021. 8. 12.  First Draft.
 *
 ****************************************************/
package kyobobook.config.database;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kyobobook.config.annotation.SlaveInterface;

/**
 * @Project     : common-prototype-api
 * @FileName    : SlaveDataSourceConfig.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Slave DataSource 및 mybatis 설정
 */
@Configuration
@MapperScan(value="kyobobook.application.adapter.out.persistence"
            , annotationClass = SlaveInterface.class
            , sqlSessionFactoryRef="slaveSqlSessionFactory")
public class SlaveDataSourceConfig {

    @Bean(name="slaveDataSource")
    @ConfigurationProperties(prefix = "spring.slave.datasource")
    public DataSource slaveDataSource() {
        return DataSourceBuilder.create().build();
    }
    
    @Bean(name="slaveSqlSessionFactory")
    public SqlSessionFactory slaveSqlSessionFactory(@Qualifier("slaveDataSource") DataSource slaveDataSource
            , ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        
        sqlSessionFactoryBean.setVfs(SpringBootVFS.class);
        sqlSessionFactoryBean.setDataSource(slaveDataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/slave/**/*Mapper.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("kyobobook.application.adapter.out.persistence.*.entity");
        sqlSessionFactoryBean.setTransactionFactory(null);
        
        Properties myBatisProperties = new Properties();
        myBatisProperties.setProperty("mapUnderscoreToCamelCase", "true");
        sqlSessionFactoryBean.setConfigurationProperties(myBatisProperties);
        
        return sqlSessionFactoryBean.getObject();
    }
    
    @Bean(name="slaveSqlSessionTemplate")
    public SqlSessionTemplate slaveSqlSessionTemplate(SqlSessionFactory slaveSqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(slaveSqlSessionFactory);
    }
}

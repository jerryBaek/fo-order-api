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

import kyobobook.config.annotation.ReaderInterface;

/**
 * @Project     : common-prototype-api
 * @FileName    : ReaderDataSourceConfig.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Reader DataSource 및 mybatis 설정
 */
@Configuration
@MapperScan(value="kyobobook.application.adapter.out.persistence"
            , annotationClass = ReaderInterface.class
            , sqlSessionFactoryRef="readerSqlSessionFactory")
public class ReaderDataSourceConfig {

    @Bean(name="readerDataSource")
    @ConfigurationProperties(prefix = "spring.reader.datasource")
    public DataSource readerDataSource() {
        return DataSourceBuilder.create().build();
    }
    
    @Bean(name="readerSqlSessionFactory")
    public SqlSessionFactory readerSqlSessionFactory(@Qualifier("readerDataSource") DataSource readerDataSource
            , ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        
        sqlSessionFactoryBean.setVfs(SpringBootVFS.class);
        sqlSessionFactoryBean.setDataSource(readerDataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/reader/**/*Mapper.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("kyobobook.application.adapter.out.persistence.*.entity");
        sqlSessionFactoryBean.setTransactionFactory(null);
        
        Properties myBatisProperties = new Properties();
        myBatisProperties.setProperty("mapUnderscoreToCamelCase", "true");
        sqlSessionFactoryBean.setConfigurationProperties(myBatisProperties);
        
        return sqlSessionFactoryBean.getObject();
    }
    
    @Bean(name="readerSqlSessionTemplate")
    public SqlSessionTemplate readerSqlSessionTemplate(SqlSessionFactory readerSqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(readerSqlSessionFactory);
    }
}

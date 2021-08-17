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
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import kyobobook.config.annotation.MasterInterface;

/**
 * @Project     : common-prototype-api
 * @FileName    : MasterDataSourceConfig.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Master DataSource 및 mybatis 설정
 */
@Configuration
@MapperScan(value="kyobobook.application.adapter.out.persistence"
            , annotationClass = MasterInterface.class
            , sqlSessionFactoryRef="masterSqlSessionFactory")
@EnableTransactionManagement
public class MasterDataSourceConfig {
    
    @Primary
    @Bean(name="masterDataSource")
    @ConfigurationProperties(prefix = "spring.master.datasource")
    public DataSource masterDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name="masterSqlSessionFactory") 
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("masterDataSource") DataSource masterDataSource
            , ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        
        sqlSessionFactoryBean.setVfs(SpringBootVFS.class);
        sqlSessionFactoryBean.setDataSource(masterDataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/master/**/*Mapper.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("kyobobook.application.adapter.out.persistence.*.entity");
        
        Properties myBatisProperties = new Properties();
        myBatisProperties.setProperty("mapUnderscoreToCamelCase", "true");
        sqlSessionFactoryBean.setConfigurationProperties(myBatisProperties);
        
        return sqlSessionFactoryBean.getObject();
    }
    
    @Primary
    @Bean(name="masterSqlSessionTemplate")
    public SqlSessionTemplate masterSqlSessionTemplate(SqlSessionFactory masterSqlSessionFactory) throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(masterSqlSessionFactory);
        return sqlSessionTemplate;
    }
    
    @Bean
    public PlatformTransactionManager transactionManager(DataSource masterDataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(masterDataSource);
        transactionManager.setGlobalRollbackOnParticipationFailure(false);
        return transactionManager;
    }
}

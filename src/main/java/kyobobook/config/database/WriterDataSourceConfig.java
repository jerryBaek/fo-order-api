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

import kyobobook.config.annotation.WriterInterface;

/**
 * @Project     : common-prototype-api
 * @FileName    : WriterDataSourceConfig.java
 * @Date        : 2021. 8. 12.
 * @author      : smlee1@kyobobook.com
 * @description : Writer DataSource 및 mybatis 설정
 */
@Configuration
@MapperScan(value="kyobobook.application.adapter.out.persistence"
            , annotationClass = WriterInterface.class
            , sqlSessionFactoryRef="writerSqlSessionFactory")
@EnableTransactionManagement
public class WriterDataSourceConfig {
    
    @Primary
    @Bean(name="writerDataSource")
    @ConfigurationProperties(prefix = "spring.writer.datasource")
    public DataSource writerDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name="writerSqlSessionFactory") 
    public SqlSessionFactory writerSqlSessionFactory(@Qualifier("writerDataSource") DataSource writerDataSource
            , ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        
        sqlSessionFactoryBean.setVfs(SpringBootVFS.class);
        sqlSessionFactoryBean.setDataSource(writerDataSource);
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:mapper/writer/**/*Mapper.xml"));
        sqlSessionFactoryBean.setTypeAliasesPackage("kyobobook.application.adapter.out.persistence.*.entity");
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis-config.xml"));
        
        return sqlSessionFactoryBean.getObject();
    }
    
    @Primary
    @Bean(name="writerSqlSessionTemplate")
    public SqlSessionTemplate writerSqlSessionTemplate(SqlSessionFactory writerSqlSessionFactory) throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(writerSqlSessionFactory);
        return sqlSessionTemplate;
    }
    
    @Bean
    public PlatformTransactionManager transactionManager(DataSource writerDataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(writerDataSource);
        transactionManager.setGlobalRollbackOnParticipationFailure(false);
        return transactionManager;
    }
}

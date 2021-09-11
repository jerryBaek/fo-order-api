/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 2.
 *
 ****************************************************/
package kyobobook.config.eventlog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 * @Project     : common-prototype-api
 * @FileName    : MongoDBConfig.java
 * @Date        : 2021. 9. 2.
 * @author      : sykim@kyobobook.com
 * @description : Document DB 설정
 */
@Configuration
public class MongoDBConfig extends AbstractMongoClientConfiguration  {
    
    @Value("${spring.data.mongodb.uri}")
    public String uri;
    
    @Value("${spring.data.mongodb.database}")
    public String database;
    
    @Value("${spring.data.mongodb.username}")
    public String username;
    
    @Value("${spring.data.mongodb.password}")
    public String password;

    
    @Override
    public MongoClient mongoClient() {
        
        ConnectionString connectionString = new ConnectionString(uri);
        MongoCredential credential = MongoCredential.createCredential(username, database, password.toCharArray());
        
        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .credential(credential)
                .applyConnectionString(connectionString)
                .build();
        
        return MongoClients.create(mongoClientSettings);
    }

    @Override
    protected String getDatabaseName() {
        
        return database;
    }
    
    @Override
    public MongoTemplate mongoTemplate(MongoDatabaseFactory databaseFactory, MappingMongoConverter converter) {
        // remove _class field from mongo
        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
        return super.mongoTemplate(databaseFactory, converter);
    }
    
    

}

/***************************************************
 * Copyright(c) 2021-2022 Kyobo Book Centre All right reserved.
 * This software is the proprietary information of Kyobo Book.
 *
 * Revision History
 * Author                         Date          Description
 * --------------------------     ----------    ----------------------------------------
 * sykim@kyobobook.com      2021. 9. 23.
 *
 ****************************************************/
package kyobobook.config.eventlog;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.mongodb.ReadPreference;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 * @Project     : fo-order-api
 * @FileName    : DocumentDBConfig.java
 * @Date        : 2021. 9. 23.
 * @author      : sykim@kyobobook.com
 * @description : Document DB 설정
 */
@Configuration
public class DocumentDBConfig extends AbstractMongoClientConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(DocumentDBConfig.class);

    @Value("${spring.data.mongodb.uri}")
    public String uri;

    @Value("${spring.data.mongodb.database}")
    public String database;

    @Value("${spring.data.mongodb.username}")
    public String username;

    @Value("${spring.data.mongodb.password}")
    public String password;

    @Value("${documentdb.ssl.invalidHostNameAllowed}")
    public boolean invalidHostNameAllowed;

    @Value("${documentdb.ssl.trustStore}")
    public String truststore;

    @Value("${documentdb.ssl.truststorePassword}")
    public String truststorePassword;


    @Override
    public MongoClient mongoClient() {

        ConnectionString connectionString = new ConnectionString(uri);
        MongoCredential credential = MongoCredential.createCredential(username, database, password.toCharArray());

        MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
                .credential(credential)
                .applyConnectionString(connectionString)
                .readPreference(ReadPreference.secondaryPreferred())
                .retryWrites(false)
                .applyToSslSettings(ssl -> {
                    ssl.enabled(true).invalidHostNameAllowed(invalidHostNameAllowed).context(getSSLContext());
                })
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

    /**
     * @Method      : getSSLContext
     * @Date        : 2021. 12. 24.
     * @author      : sykim@kyobobook.com
     * @description : SSLContext 설정
     * @return
     */
    private SSLContext getSSLContext() {

        SSLContext sslContext = null;

        KeyStore keyStore;

        try {
            keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(new FileInputStream(truststore), truststorePassword.toCharArray());

            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());

            trustManagerFactory.init(keyStore);

            sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, trustManagerFactory.getTrustManagers(), null);

        } catch (KeyStoreException e) {
            logger.error("DocumentDB KeyStore Error :: " + e);
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            logger.error("DocumentDB NoSuchAlgorithmException Error :: " + e);
            e.printStackTrace();
        } catch (KeyManagementException e) {
            logger.error("DocumentDB KeyManagement Error:: " + e);
            e.printStackTrace();
        } catch (CertificateException e) {
            logger.error("DocumentDB Certificate Error:: " + e);
            e.printStackTrace();
        } catch (IOException e) {
            logger.error("DocumentDB truststore file IO Error :: " + e);
            e.printStackTrace();
        }

        return sslContext;

    }

}
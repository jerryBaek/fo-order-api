## fo-common-prototype-api
---

### 1. Overview

이 프로젝트는 FO Common API Prototype 입니다.

### 2. 개발 환경
- Spring Boot 2.3.0
- Gradle 6.8
- OpenJDK 11
- Mybatis 3.5.2
- SpringFox Swagger2 2.9.2
- Protocol Buffers 3.5.1
- Protoc Gen GRPC Java 1.37.0
- Lombok 1.18.20

### 2.1. Local 개발 환경 셋팅
- AWS Document DB 연동을 위한 Local 환경 설정  
  1. AWS 환경 정보  
     https://kyobobook.atlassian.net/wiki/spaces/ACT/pages/117375140/RDS  
  2. Bastion 터널링  
     localhost:27017 -> aws-tst-rosa-docdb1-proto.cluster-cnfj3o94pok7.ap-northeast-2.docdb.amazonaws.com:27017   
  3. rds-truststore.jks Key를 src/resources/certs 아래에 위치시킨다.   
  4. Run Configurations 설정을 진행한다.  
     경로 :: Run Configurations > Arguments > VM arguments:  
     입력 내용 ::   
       -Djavax.net.ssl.trustStore=/certs/rds-truststore.jks  
       -Djavax.net.ssl.trustStorePassword=<TRUSTSTORE-PASSWORD>  
     ※ rds-truststore.jks 및 TRUSTSTORE-PASSWORD는 별도 전달   

### 3. [Release Notes](./ReleaseNotes.md)

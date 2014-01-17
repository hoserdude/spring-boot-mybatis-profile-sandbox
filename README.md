spring-boot-mybatis-profile-sandbox
===================================

Epic attempt to get Spring Boot + MyBatis working with Java Config

This is built on the Spring Boot Profile sample (https://github.com/spring-projects/spring-boot) to exercise external configuration using yaml.

The goal is to get Spring's Config capabilities to work with MyBatis MapperScanner using Java config + Annotations.

Challenge: MyBatis MapperScanner creates Beans that depend on SqlSessionFactory which depends on DataSource which depends on Properties which are not built until AFTER MyBatis does it's thing.  Essentially everything is backwards.

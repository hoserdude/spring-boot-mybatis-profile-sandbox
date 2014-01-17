package sample.profile;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages="sample.profile.persistence"/*, sqlSessionFactoryRef="mySessionFactory"*/)
public class DatabaseConfig {
    
    @Autowired
    private ConnectionSettings connectionSettings;
    
    @Autowired
    private DataSource dataSource;
    
    @Bean
    public DataSource dataSource() {
    	BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(connectionSettings.getDriver());
        dataSource.setUrl(connectionSettings.getUrl());
        dataSource.setUsername(connectionSettings.getUsername());
        dataSource.setPassword(connectionSettings.getPassword());
        
        return dataSource;
    }
 
    @Bean/*(name="mySessionFactory")*/
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }
    
    @Bean
    public DataSourceTransactionManager transactionManager() {
      return new DataSourceTransactionManager(dataSource());
    }

}

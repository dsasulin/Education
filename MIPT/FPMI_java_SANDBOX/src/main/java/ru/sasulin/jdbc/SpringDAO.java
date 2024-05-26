package ru.sasulin.jdbc;

import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories(basePackages = "ru.sasulin.jdbc")
@EnableTransactionManagement
public class SpringDAO {

    @Bean
    public DataSource dataSource(){
        JdbcDataSource ds = new JdbcDataSource();
        ds.setURL("jdbc:h2:.\\Office");
        return ds;
    }
}

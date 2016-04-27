package com.sourceallies.aeleakdetection;


import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class CoreConfiguration {
    private static Logger logger = LoggerFactory.getLogger(CoreConfiguration.class);
    @Bean
    static public PropertySourcesPlaceholderConfigurer  propertyPlaceholderConfigurator() {
        PropertySourcesPlaceholderConfigurer  configurator = new PropertySourcesPlaceholderConfigurer();
        configurator.setLocations(new Resource[] {
                new ClassPathResource("props/default.properties")
        });
        logger.info("setting default properties");
        return configurator;
    }   
    
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
        dataSourceBuilder.url("jdbc:sqlite:your.db");
        return dataSourceBuilder.build();   
    }
}

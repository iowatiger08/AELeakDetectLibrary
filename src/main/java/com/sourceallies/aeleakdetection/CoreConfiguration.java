package com.sourceallies.aeleakdetection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
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
    public void SQLlite(){
        
    }
}

package com.sbi.benefits;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

   /* @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder, @Value("${myrest.url}") String url ){
       return restTemplateBuilder.rootUri(url).build();
    }*/

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public HikariDataSource dataSource()
    {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }
}

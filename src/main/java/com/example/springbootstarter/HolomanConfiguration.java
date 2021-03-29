package com.example.springbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HolomanProperties.class)
public class HolomanConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public Holoman holoman(HolomanProperties holomanProperties){
        Holoman holoman = new Holoman();
        holoman.setHowLong(holomanProperties.getHowLong());
        holoman.setName(holomanProperties.getName());
        return holoman;
    }
}

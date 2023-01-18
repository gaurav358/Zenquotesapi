package com.zenquotesapi.zenquotesapi.spring;

import com.zenquotesapi.zenquotesapi.helping.Browser;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MethodBean {
    @Bean
    @ConfigurationProperties(prefix="browser.config")
    public Browser browserConfig()
    {
        return new Browser();
    }

}

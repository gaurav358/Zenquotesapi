package com.zenquotesapi.zenquotesapi;

import com.spring4all.mongodb.EnableMongoPlus;
import com.zenquotesapi.zenquotesapi.helping.BrowserMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableMongoPlus
@SpringBootApplication
public class ZenquotesapiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ZenquotesapiApplication.class, args);
	}

}


package com.zenquotesapi.zenquotesapi;

import com.zenquotesapi.zenquotesapi.helping.BrowserMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZenquotesapiApplication {

	public static void main(String[] args) {
		BrowserMap brows = new BrowserMap();
		SpringApplication.run(ZenquotesapiApplication.class, args);
	}

}


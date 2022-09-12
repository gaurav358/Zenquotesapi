package com.zenquotesapi.zenquotesapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
    @GetMapping("/home")
    public String home(){
        String quote = "https://zenquotes.io/api/random";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(quote,String.class);
        System.out.println(result);
        return result;
}
}



package com.zenquotesapi.zenquotesapi.controller;

import com.zenquotesapi.zenquotesapi.models.AllQuotes;
import com.zenquotesapi.zenquotesapi.repo.Quotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@Autowired
private Quotes quotes;

    @PostMapping("/addQuotes")
    public ResponseEntity<?> addQuotes(@RequestBody AllQuotes allQuotes){
        AllQuotes save = this.quotes.save(allQuotes);
        return ResponseEntity.ok(save);
    }
    @GetMapping("/getQuotes")
    public ResponseEntity<?> getQuotes(){
        return ResponseEntity.ok(this.quotes.findAll());
    }


}


package com.zenquotesapi.zenquotesapi.controller;

import com.zenquotesapi.zenquotesapi.models.AllQuotes;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteByAggregate;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class QuoteController {
    @Autowired
    private QuoteByAggregate quoteByAggregate;
    @Autowired
    private QuoteService quoteService;

    @GetMapping("/quote")
    public List<AllQuotes> getRandom()
    {
        return quoteService.getRandomQuotes();
    }

    @GetMapping("/aggregate")
    public Optional<AllQuotes> getAgg(@RequestHeader(value = "User-Agent") String userAgent, @RequestParam Map<String, String> aggre)
    {
        return quoteByAggregate.agg(userAgent, aggre);
    }

    @GetMapping("/")
    public String home()
    {
        return "zenquotes api ";
    }

}

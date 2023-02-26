package com.zenquotesapi.zenquotesapi.controller;

import com.zenquotesapi.zenquotesapi.helping.Browser;
import com.zenquotesapi.zenquotesapi.helping.BrowserMap;
import com.zenquotesapi.zenquotesapi.models.AllQuotes;
import com.zenquotesapi.zenquotesapi.repo.Countryrepo;
import com.zenquotesapi.zenquotesapi.repo.Quotes;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteByAggregate;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteByBrowser;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteByCountry;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
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
    private Quotes quotes;
    @Autowired
    private QuoteByAggregate quoteByAggregate;
    @Autowired
    private QuoteService quoteService;
    @Autowired
    private QuoteByCountry quoteByCountryService;
    @Autowired
    private QuoteByBrowser quoteByBrowser;
@Autowired
    private BrowserMap browserMap;

    @GetMapping("/author")
    public AllQuotes getQuoteWithAuthor(@RequestParam("author") String author) {

            return quoteService.getQuoteWithAuthor(author);
    }


    @GetMapping("/quote")
    public List<AllQuotes> getRandom() {
        return quoteService.getRandomQuotes();
    }

    @GetMapping("/country")
    public AllQuotes getByCountry(@RequestParam("country") String country) {
            return quoteByCountryService.giveQuoteByCountry(country);

    }

    @GetMapping("/browser")
    public AllQuotes getByBrowser(@RequestHeader(value = "User-Agent") String userAgent) {
            String browser = "postman";
             browser = browserMap.getAgent(userAgent);
            return quoteByBrowser.giveQuoteByBrowser(browser);
    }


    @GetMapping("/aggregate")
    public Optional<AllQuotes> getAgg(@RequestHeader(value = "User-Agent") String userAgent, @RequestParam Map<String,String> aggre) {
        return quoteByAggregate.agg( userAgent, aggre);
    }
    @GetMapping("/")
    public String getAgg() {
        return "zenquotes api ";
    }

}


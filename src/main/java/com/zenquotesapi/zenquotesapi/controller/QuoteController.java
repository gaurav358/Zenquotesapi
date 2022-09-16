package com.zenquotesapi.zenquotesapi.controller;

import com.zenquotesapi.zenquotesapi.helping.Helper;
import com.zenquotesapi.zenquotesapi.models.AllQuotes;
import com.zenquotesapi.zenquotesapi.repo.Countryrepo;
import com.zenquotesapi.zenquotesapi.repo.Quotes;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteByAggregate;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteByBrowser;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteByCountry;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

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
    private Countryrepo countryrepo;

    @GetMapping("/getQuoteByAuthor")
    public Object getQuoteWithAuthor(@RequestParam("author") String author) {

            return quoteService.getQuoteWithAuthor(author);
    }

    @GetMapping("/getRandomQuote")
    public List<AllQuotes> getRandom() {
        return quoteService.getRandomQuotes();
    }

    @GetMapping("/getQuoteByCountry")
    public Object getByCountry(@RequestParam("country") String country) {
            return quoteByCountryService.giveQuoteByCountry(country);

    }

    @GetMapping("/getQuoteByBrowser")
    public Object getByBrowser(@RequestHeader(value = "User-Agent") String userAgent) {

            String browser = Helper.browser_name(userAgent);
            return quoteByBrowser.giveQuoteByBrowser(browser);

    }

    @GetMapping("/getAgg")
    public Object getAgg(@RequestHeader(value = "User-Agent") String userAgent, @RequestParam Map<String,String> aggre) {
        return quoteByAggregate.agg( userAgent, aggre);
    }

}


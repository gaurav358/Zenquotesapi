package com.zenquotesapi.zenquotesapi.serviceImpl;

import com.zenquotesapi.zenquotesapi.models.AllQuotes;
import com.zenquotesapi.zenquotesapi.models.CountryMapping;
import com.zenquotesapi.zenquotesapi.repo.Countryrepo;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteByCountry;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
public class QuoteByCountryImpl implements QuoteByCountry {
    @Autowired
    private QuoteService quoteService;
    @Autowired
    private Countryrepo countryrepo;
    public AllQuotes giveQuoteByCountry(String country)
    {   List<String> authorList = new ArrayList<>();
        List<CountryMapping> countrydata =  countryrepo.getBycountry(country);
        for(CountryMapping triii:countrydata){
             authorList = triii.getAuthor();
        }
        String author = authorList.get(new Random().nextInt(authorList.size()));

        return quoteService.getQuoteWithAuthor(author);

    }

}

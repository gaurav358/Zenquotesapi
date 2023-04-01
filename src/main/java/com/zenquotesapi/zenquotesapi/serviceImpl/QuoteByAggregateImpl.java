package com.zenquotesapi.zenquotesapi.serviceImpl;

import com.zenquotesapi.zenquotesapi.helping.BrowserMap;
import com.zenquotesapi.zenquotesapi.models.AllQuotes;
import com.zenquotesapi.zenquotesapi.models.BrowserMapping;
import com.zenquotesapi.zenquotesapi.models.CountryMapping;
import com.zenquotesapi.zenquotesapi.repo.Browserrepo;
import com.zenquotesapi.zenquotesapi.repo.Countryrepo;
import com.zenquotesapi.zenquotesapi.repo.Quotes;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteByAggregate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class QuoteByAggregateImpl implements QuoteByAggregate {

    @Autowired
    private Quotes quotes;
    @Autowired
    private Countryrepo countryrepo;

    @Autowired
    private Browserrepo browserrepo;
@Autowired
    private BrowserMap browserMap;
    @Override
    public Optional<AllQuotes> agg(String userAgent, Map<String,String> aggre) {


        List<Integer> aggregate = new ArrayList<>();
        if(aggre.get("country") != null)
        {

            List<AllQuotes> country;
            List<Integer> ids = new ArrayList<>();
            List<String> authorList = new ArrayList<>();
        List<CountryMapping> countrydata =  countryrepo.getBycountry(aggre.get("country"));
        for(CountryMapping triii:countrydata){
            authorList = triii.getAuthor();
        }

         country = quotes.findBy(authorList);
            for( AllQuotes trii: country)
                ids.add(trii.getId());

            aggregate= ids;
    }


        if(aggre.get("browser") != null)
        {

            List<AllQuotes> browser;
            List<Integer> ids = new ArrayList<>();

            List<String> authorList = new ArrayList<>();
            String browserName = browserMap.getAgent(userAgent);
            List<BrowserMapping> browserdata = browserrepo.getByBrowser(browserName);
            for (BrowserMapping triii : browserdata) {
                authorList = triii.getAuthor();
            }

         browser = quotes.findBy(authorList);
        for( AllQuotes trii: browser)
            ids.add(trii.getId());
         if (aggregate.size() == 0)
            aggregate = ids;
        else
             aggregate.retainAll(ids);

    }
            int id = aggregate.get(new Random().nextInt(aggregate.size()));

            return quotes.findById(id);

    }
}

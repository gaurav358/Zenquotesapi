package com.zenquotesapi.zenquotesapi.serviceImpl;

import com.zenquotesapi.zenquotesapi.models.AllQuotes;
import com.zenquotesapi.zenquotesapi.repo.Quotes;
import com.zenquotesapi.zenquotesapi.serviceInterface.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuoteServiceImpl implements QuoteService {
    @Autowired
    private Quotes quotes;

    @Override
    public List<AllQuotes> getRandomQuotes() {
        return quotes.random();
    }

    @Override
    public AllQuotes getQuoteWithAuthor(String author) {
        List<AllQuotes> allQuotes = quotes.findByAuthor(author);
        return allQuotes.get(new Random().nextInt(allQuotes.size()));
    }
}

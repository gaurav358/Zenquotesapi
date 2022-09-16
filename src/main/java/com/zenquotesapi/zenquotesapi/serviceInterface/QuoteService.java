package com.zenquotesapi.zenquotesapi.serviceInterface;

import com.zenquotesapi.zenquotesapi.models.AllQuotes;

import java.util.List;

public interface QuoteService {

     AllQuotes getQuoteWithAuthor(String author);

    List<AllQuotes> getRandomQuotes();


    }

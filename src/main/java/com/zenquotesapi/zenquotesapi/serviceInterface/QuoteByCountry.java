package com.zenquotesapi.zenquotesapi.serviceInterface;

import com.zenquotesapi.zenquotesapi.models.AllQuotes;

public interface QuoteByCountry {
     AllQuotes giveQuoteByCountry(String country);

}

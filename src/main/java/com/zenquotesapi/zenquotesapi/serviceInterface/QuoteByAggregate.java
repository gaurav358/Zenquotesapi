package com.zenquotesapi.zenquotesapi.serviceInterface;

import com.zenquotesapi.zenquotesapi.models.AllQuotes;

import java.util.Map;
import java.util.Optional;

public interface QuoteByAggregate {
    public Optional<AllQuotes> agg(String userAgent, Map<String,String> aggre);

}

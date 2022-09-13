package com.zenquotesapi.zenquotesapi.repo;

import com.zenquotesapi.zenquotesapi.models.AllQuotes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Quotes extends MongoRepository<AllQuotes,Integer> {
}

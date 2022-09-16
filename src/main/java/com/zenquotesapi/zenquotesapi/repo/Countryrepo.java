package com.zenquotesapi.zenquotesapi.repo;

import com.zenquotesapi.zenquotesapi.models.CountryMapping;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface Countryrepo extends MongoRepository<CountryMapping,Integer> {

    List<CountryMapping> getBycountry(String count);
}

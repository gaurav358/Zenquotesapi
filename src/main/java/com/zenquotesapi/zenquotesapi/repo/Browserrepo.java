package com.zenquotesapi.zenquotesapi.repo;

import com.zenquotesapi.zenquotesapi.models.BrowserMapping;
import com.zenquotesapi.zenquotesapi.models.CountryMapping;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface Browserrepo extends MongoRepository<BrowserMapping,Integer> {
    List<BrowserMapping> getByBrowser(String brow);

}

package com.zenquotesapi.zenquotesapi.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "countryMapping")
public class CountryMapping {
    private String country;
    private List<String> author;

    public CountryMapping(String country, List<String> author) {
        this.country = country;
        this.author = author;
    }

    public List<String> getAuthor() {
        return author;
    }
}

package com.zenquotesapi.zenquotesapi.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "browserMapping")

public class BrowserMapping {
    private String browser;
    private List<String> author;

    public BrowserMapping(String browser, List<String> author) {
        this.browser = browser;
        this.author = author;
    }


    public List<String> getAuthor() {
        return author;
    }

}

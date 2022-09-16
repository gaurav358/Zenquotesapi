package com.zenquotesapi.zenquotesapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
@Document(collection = "AllQuotes")
public class AllQuotes {
    @Id
    private int id;
     private String quote;
     private String author;

    public AllQuotes(String quote, String author, int id) {
        this.id = id;
        this.quote = quote;
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public int getId() {
        return id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

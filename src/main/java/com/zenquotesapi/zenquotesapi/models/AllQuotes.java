package com.zenquotesapi.zenquotesapi.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
@Document(collection = "AllQuotes")
@Data
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

}

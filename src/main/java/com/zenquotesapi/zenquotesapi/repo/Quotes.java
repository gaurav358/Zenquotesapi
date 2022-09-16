package com.zenquotesapi.zenquotesapi.repo;
import java.util.*;
import com.zenquotesapi.zenquotesapi.models.AllQuotes;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Quotes extends MongoRepository<AllQuotes,Integer> {

   List<AllQuotes> findByAuthor(String author);

@Query("{author : { $in : ?0}}")
   List<AllQuotes> findBy(List<String> authors);

   @Aggregation(pipeline={"{$sample:{size:1}}"})
   List<AllQuotes> random();


}

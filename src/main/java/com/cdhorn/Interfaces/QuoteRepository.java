package com.cdhorn.Interfaces;

import com.cdhorn.Models.Quote;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuoteRepository extends MongoRepository<Quote, String> {


}

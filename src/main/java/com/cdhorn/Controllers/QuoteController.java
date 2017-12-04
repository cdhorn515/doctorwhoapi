package com.cdhorn.Controllers;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class QuoteController {

    MongoClient mongoClient = new MongoClient("localhost", 27017);
    DB db = mongoClient.getDB("doctorquotedb");
    DBCollection table = db.getCollection("quote");
}

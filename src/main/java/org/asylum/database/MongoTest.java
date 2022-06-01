package org.asylum.database;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import com.mongodb.reactivestreams.client.MongoCollection;
import com.mongodb.reactivestreams.client.MongoDatabase;
import org.bson.Document;
import org.bukkit.event.Listener;

public class MongoTest implements Listener {
    MongoClient mongoClient = MongoClients.create("mongodb+srv://AsylumDB:§0Ã╪需αSψλÛμ@asylumcluster.opfxr.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoDatabase database = mongoClient.getDatabase("sample_weatherdata");
    MongoCollection<Document> coll = database.getCollection("data");
}

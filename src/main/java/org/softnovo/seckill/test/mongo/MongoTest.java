package org.softnovo.seckill.test.mongo;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class MongoTest {
	public static void main(String[] args) {
		MongoClient mongoClient = new MongoClient("127.0.0.1", 27017);
		MongoIterable<String> list = mongoClient.listDatabaseNames();
		MongoCursor<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println("_++_+_+_+_____ " + it.next());
		}
		
		MongoDatabase mongoDatabase = mongoClient.getDatabase("foobar");
		MongoCollection<Document> mongoCollection = mongoDatabase.getCollection("ddd");
		System.out.println(")))+)+))+)++ " + mongoCollection.countDocuments());
		
		Document document = new Document();
		document.put("hhh", 123);
		document.put("jjj", "jjj");
		mongoCollection.insertOne(document);
		System.out.println(")))+)+))+)++ " + mongoCollection.countDocuments());
		
		
		
		mongoClient.close();
		
	}
	
	
	
	

}

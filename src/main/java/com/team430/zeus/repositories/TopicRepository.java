package com.team430.zeus.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.query.Query;
import com.team430.zeus.models.*;


@Repository
public class TopicRepository {
	
	@Autowired
	Datastore datastore;

	public List<Topic> findAll(){
		//Query q = datastore.createQuery(Topic.class);
		Query q = datastore.find(Topic.class);
		return q.asList();
	}
}
package com.example.demo.dao;

import com.example.demo.model.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RootDaoImpl implements RootDao{
    @Autowired
    private final MongoTemplate mongoTemplate;

    public RootDaoImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }


    @Override
    public List<Root> findAll() {
        return mongoTemplate.findAll(Root.class, "root");
    }

    @Override
    public Root save(Root root) {
        return mongoTemplate.save(root);
    }
}

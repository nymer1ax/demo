package com.example.demo.dao;

import com.example.demo.model.Root;

import java.util.List;

public interface RootDao {
    List<Root> findAll();
    Root save(Root root);

}

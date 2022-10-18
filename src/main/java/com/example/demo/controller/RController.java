package com.example.demo.controller;

import com.example.demo.dao.RootDaoImpl;
import com.example.demo.model.Root;
import com.google.gson.Gson;
import org.bson.json.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class RController {
    @Autowired
    RootDaoImpl repository;

    @GetMapping("/root")
    public List<Root> getAll(){
        return repository.findAll();
    }

    @PostMapping("/root")
    public Root save(@RequestBody Root json){

        return repository.save(json);
    }


}

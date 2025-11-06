package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Demorepository extends MongoRepository <DemoModel ,String>{
    
}

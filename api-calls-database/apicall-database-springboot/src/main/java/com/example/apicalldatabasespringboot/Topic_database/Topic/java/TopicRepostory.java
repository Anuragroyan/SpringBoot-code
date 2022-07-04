package com.example.apicalldatabasespringboot.Topic_database.Topic.java;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepostory extends CrudRepository<Topic, String> {

    Topic findOne(String id);

    void delete(String id);

    
}

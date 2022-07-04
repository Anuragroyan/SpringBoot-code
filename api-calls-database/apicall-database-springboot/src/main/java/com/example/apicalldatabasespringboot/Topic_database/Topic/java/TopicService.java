package com.example.apicalldatabasespringboot.Topic_database.Topic.java;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    private TopicRepostory topicRepostory;
    

    public List<Topic> getAllRTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepostory.findAll()
        .forEach(topics::add);
        return topics;
    }
    
    public Topic getTopic(String id){
        return topicRepostory.findOne(id);
    }

    public void addTopic(Topic topic) {
        topicRepostory.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepostory.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepostory.delete(id);
    }
}

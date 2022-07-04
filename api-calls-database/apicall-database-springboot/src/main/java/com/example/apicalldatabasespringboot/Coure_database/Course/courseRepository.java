package com.example.apicalldatabasespringboot.Coure_database.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface courseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);

    public Course findOne(String id);

    public void delete(String id);
    
}

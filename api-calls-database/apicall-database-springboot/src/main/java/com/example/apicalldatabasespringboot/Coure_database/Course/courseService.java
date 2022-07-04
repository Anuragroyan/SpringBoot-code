package com.example.apicalldatabasespringboot.Coure_database.Course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class courseService {

    @Autowired
    private courseRepository courserepository;

    public List<Course> getAllCourse(String topicId) {
        List<Course> course = new ArrayList<>();
        courserepository.findByTopicId(topicId)
        .forEach(course::add);
        return course;
    }

    public Course getCourse(String id) {
        return courserepository.findOne(id);
    }

    public void addCourse(Course course) {
        courserepository.save(course);
    }

    public void updateCourse(Course course) {
        courserepository.save(course);
    }

    public void deleteCourse(String id) {
        courserepository.delete(id);
    }
    
}

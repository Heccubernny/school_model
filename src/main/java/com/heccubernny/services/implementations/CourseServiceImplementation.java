package com.heccubernny.services.implementations;

import com.heccubernny.models.Course;
import com.heccubernny.services.CourseService;

public class CourseServiceImplementation implements CourseService {

    private Course courses;

    public CourseServiceImplementation() {
        this.courses = new Course();
    }

    @Override
    public String addCourse(String courseName) {
        if (courseName == null || courseName.isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be null or empty");
        }
        courses.setName(courseName);
        return courseName;
    }

    @Override
    public boolean removeCourse(String courseId) {
        if (courseId == null || courseId.isEmpty()) {
            throw new IllegalArgumentException("Course ID cannot be null or empty");
        }
        return courses.removeCourseById(courseId);
    }

}
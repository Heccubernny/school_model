package com.heccubernny.services;

import com.heccubernny.models.Course;

public interface StudentService {
    void takeCourse(Course course);

    Boolean offendSchoolSystem();

}

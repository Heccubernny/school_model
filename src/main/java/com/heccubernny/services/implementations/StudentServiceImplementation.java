package com.heccubernny.services.implementations;

import com.heccubernny.models.Course;
import com.heccubernny.services.StudentService;

public class StudentServiceImplementation implements StudentService {
    @Override
    public void takeCourse(Course course) {
        System.out.printf("%s is taking %s course.\n", course.getName());
    }

    @Override
    public Boolean offendSchoolSystem() {
        return true;
    }
}

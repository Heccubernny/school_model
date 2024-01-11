package com.heccubernny.services.implementations;

import com.heccubernny.models.Course;
import com.heccubernny.services.TeacherService;

public class TeacherServiceImplementation implements TeacherService {

    public void teachCourse(Course course) {
        System.out.printf("%s is teaching %s course.\n", course.getName());
    }

}
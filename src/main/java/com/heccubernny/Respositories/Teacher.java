package com.heccubernny.Respositories;

// import java.util.ArrayList;

import com.heccubernny.Interfaces.ITeacher;

public class Teacher extends Person implements ITeacher {

    public void teachCourse(Course course) {
        System.out.printf("%s is teaching %s course.\n", this.getName(), course.getName());
    }

}
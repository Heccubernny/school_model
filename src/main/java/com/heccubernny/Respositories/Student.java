package com.heccubernny.Respositories;

import com.heccubernny.Interfaces.IStudent;

public class Student extends Person implements IStudent {

    public void takeCourse(Course course) {
        System.out.printf("%s is taking %s course.\n", this.getName(), course.getName());
    }

    public Boolean offendSchoolSystem() {
        return true;
    }

}
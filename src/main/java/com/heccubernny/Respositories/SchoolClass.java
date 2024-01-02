package com.heccubernny.Respositories;

import java.util.List;

public class SchoolClass {
    Teacher teacher;
    List<Student> students;
    Course course;
    SchoolClass schoolClass;

    public void setTeacher(Teacher teacher) {
        System.out.printf("%s was assigned to course \n", teacher.getName());
    }
}
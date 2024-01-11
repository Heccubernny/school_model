package com.heccubernny.services.implementations;

import java.util.List;

import com.heccubernny.models.Course;
import com.heccubernny.models.SchoolClass;
import com.heccubernny.models.Student;
import com.heccubernny.models.Teacher;
import com.heccubernny.services.SchoolClassService;

public class SchoolClassServiceImplementation implements SchoolClassService {
    Teacher teacher;
    List<Student> students;
    Course course;
    SchoolClass schoolClass;

    public void setTeacher(Teacher teacher) {
        System.out.printf("%s was assigned to course \n", teacher.getName());
    }
}
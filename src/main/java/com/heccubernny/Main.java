package com.heccubernny;

import java.util.ArrayList;
import java.util.List;

import com.heccubernny.Respositories.Course;
import com.heccubernny.Respositories.School;
import com.heccubernny.Respositories.SchoolClass;
import com.heccubernny.Respositories.Student;
import com.heccubernny.Respositories.Teacher;

public class Main {
    public static void main(String[] args) {

        Course[] courses = new Course[3];

        Course course1 = new Course();
        course1.setName("Mathematics");
        courses[0] = course1;

        Course course2 = new Course();
        course2.setName("Physics");
        courses[1] = course2;

        Course course3 = new Course();
        course3.setName("English");
        courses[2] = course3;

        Teacher teacher = new Teacher();
        teacher.setName("Mr John");
        teacher.setAge(30);
        teacher.teachCourse(course2);

        Student student = new Student();
        student.setName("Michealson Ray");
        student.setAge(11);

        School school = new School();
        school.addCourse(course1);
        school.addCourse(course2);
        school.addCourse(course3);

        // create a list of students and add the students to it
        List<Student> students = new ArrayList<Student>();
        students.add(student);

        // set the properties of the classes
        SchoolClass classes = new SchoolClass();
        classes.setTeacher(teacher);
    }
}
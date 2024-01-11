package com.heccubernny;

import java.util.ArrayList;
import java.util.List;

import com.heccubernny.services.ApplicantService;
import com.heccubernny.services.CourseService;
import com.heccubernny.services.NonAcademicStaffService;
import com.heccubernny.services.PrincipalService;
import com.heccubernny.services.SchoolClassService;
import com.heccubernny.services.SchoolService;
import com.heccubernny.services.StudentService;
import com.heccubernny.services.TeacherService;

public class Main {

    // Dependencies inversions
    TeacherService teacherService;
    StudentService studentService;
    SchoolService schoolService;
    SchoolClassService schoolClassService;
    PrincipalService principalService;
    NonAcademicStaffService nonAcademicStaffService;
    CourseService courseService;
    ApplicantService applicantService;

    public static void main(String[] args) {

        // Course[] courses = new Course[3];

        // Course course1 = new Course();
        // course1.setName("Mathematics");
        // courses[0] = course1;

        // Course course2 = new Course();
        // course2.setName("Physics");
        // courses[1] = course2;

        // Course course3 = new Course();
        // course3.setName("English");
        // courses[2] = course3;

        // Teacher teacher = new Teacher();
        // teacher.setName("Mr John");
        // teacher.setAge(30);
        // teacher.teachCourse(course2);

        // TeacherService teacherService = new Teacher();

        // Student student = new Student();
        // student.setName("Michealson Ray");
        // student.setAge(11);

        // School school = new School();
        // school.addCourse(course1);
        // school.addCourse(course2);
        // school.addCourse(course3);

        // // create a list of students and add the students to it
        // List<Student> students = new ArrayList<Student>();
        // students.add(student);

        // // set the properties of the classes
        // SchoolClass classes = new SchoolClass();
        // classes.setTeacher(teacher);
    }
}
package com.heccubernny.Respositories;

import java.util.ArrayList;
import java.util.List;

public class School {
    // we can have multiple instances of the same class.
    List<Student> students;
    List<Teacher> teachers;
    List<Course> courses;
    List<SchoolClass> classes;
    List<Applicant> applicants;
    List<NonAcademicStaff> nonAcademicStaffs;

    // only one principal is needed in a school
    Principal principal;

    /**
     */
    public School() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

}

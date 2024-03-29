package com.heccubernny.services.implementations;

import java.util.ArrayList;
import java.util.List;

import com.heccubernny.models.Applicant;
import com.heccubernny.models.Course;
import com.heccubernny.models.NonAcademicStaff;
import com.heccubernny.models.Principal;
import com.heccubernny.models.SchoolClass;
import com.heccubernny.models.Student;
import com.heccubernny.models.Teacher;
import com.heccubernny.services.SchoolService;

public class SchoolServiceImplementation implements SchoolService {
    // we can have multiple instances of the same class.
    Student students;
    List<Teacher> teachers;
    Course courses;
    List<SchoolClass> classes;
    List<Applicant> applicants;
    List<NonAcademicStaff> nonAcademicStaffs;

    // only one principal is needed in a school
    Principal principal;

    /**
     */
    public SchoolServiceImplementation() {
        this.students = new Student();
    }

    @Override
    public void addCourse(Course course) {
        this.students.setCourse(course);
    }

}

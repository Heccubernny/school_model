package com.heccubernny;

import java.util.ArrayList;
import java.util.List;

import com.heccubernny.models.Applicant;
import com.heccubernny.models.Course;
import com.heccubernny.models.School;
import com.heccubernny.models.Student;
import com.heccubernny.models.Teacher;
import com.heccubernny.services.ApplicantService;
import com.heccubernny.services.CourseService;
import com.heccubernny.services.NonAcademicStaffService;
import com.heccubernny.services.PrincipalService;
import com.heccubernny.services.SchoolClassService;
import com.heccubernny.services.SchoolService;
import com.heccubernny.services.StudentService;
import com.heccubernny.services.TeacherService;
import com.heccubernny.services.implementations.ApplicantServiceImplementation;
import com.heccubernny.services.implementations.CourseServiceImplementation;
import com.heccubernny.services.implementations.NonAcademicStaffServiceImplementation;
import com.heccubernny.services.implementations.PrincipalServiceImplementation;
import com.heccubernny.services.implementations.SchoolClassServiceImplementation;
import com.heccubernny.services.implementations.SchoolServiceImplementation;
import com.heccubernny.services.implementations.StudentServiceImplementation;
import com.heccubernny.services.implementations.TeacherServiceImplementation;

public class Main {

    // Dependencies inversions
    public static void main(String[] args) {
        // Service implementation
        PrincipalService principalService = new PrincipalServiceImplementation();
        TeacherService teacherService = new TeacherServiceImplementation();
        StudentService studentService = new StudentServiceImplementation();
        SchoolService schoolService = new SchoolServiceImplementation();
        SchoolClassService schoolClassService = new SchoolClassServiceImplementation();
        NonAcademicStaffService nonAcademicStaffService = new NonAcademicStaffServiceImplementation();
        CourseService courseService = new CourseServiceImplementation();
        ApplicantService applicantService = new ApplicantServiceImplementation();

        // Entity implementation
        Student student1 = new Student();
        Applicant applicant1 = new Applicant();
        Course course = new Course();
        Teacher teacher = new Teacher();

        course.setName("Yoruba");

        student1.setName("Adewale");
        student1.setAge(12);

        applicant1.setId(22);
        teacher.setName("Mr Magos");
        teacher.setAge(54);

        // method implementation
        principalService.canExpelStudent(student1);

        boolean submitApplication = applicantService.submitApplication(applicant1);

        // printed result
        System.out.println(submitApplication);

        System.out
                .printf("Student with name %s and age %d are expelled\n", student1.getName(), student1.getAge());
        System.out.printf("This is the %s name\n",
                course.getName());

        studentService.takeCourse(course);

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

        teacher.setName("Mr John");
        teacher.setAge(30);
        teacherService.teachCourse(course2);

        Student student = new Student();
        student.setName("Michealson Ray");
        student.setAge(11);

        schoolService.addCourse(course1);
        schoolService.addCourse(course2);
        schoolService.addCourse(course3);

        // create a list of students and add the students to it
        List<Student> students = new ArrayList<Student>();
        students.add(student);

        // set the properties of the classes
        schoolClassService.setTeacher(teacher);
    }
}
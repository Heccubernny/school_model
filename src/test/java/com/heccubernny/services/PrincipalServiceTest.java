package com.heccubernny.services;

import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import com.heccubernny.models.Applicant;
import com.heccubernny.models.Student;
import com.heccubernny.services.implementations.ApplicantServiceImplementation;
import com.heccubernny.services.implementations.PrincipalServiceImplementation;
import com.heccubernny.services.implementations.SchoolServiceImplementation;

public class PrincipalServiceTest {

    @Test
    public void testCanAdmitApplicant() {
        Applicant applicant = new Applicant("John", 12); // Creating an applicant aged 12
        PrincipalServiceImplementation schoolService = new PrincipalServiceImplementation();
        schoolService.canAdmitApplicant(applicant);

    }

    @Test
    public void testCanExpelStudent() {
        Student student = new Student();
        student.setName("Alice");
        student.offendSchoolSystem();

        PrincipalServiceImplementation schoolService = new PrincipalServiceImplementation();
        schoolService.canExpelStudent(student);

    }

}

package com.heccubernny.services.implementations;

import com.heccubernny.services.PrincipalService;
import com.heccubernny.models.Applicant;
import com.heccubernny.models.Student;

public class PrincipalServiceImplementation implements PrincipalService {

    @Override
    public void canAdmitApplicant(Applicant applicant) {
        if (applicant.getAge() > 10) {
            System.out.printf("Applicant %s admitted.\n", applicant.getName());
        }
    }

    @Override
    public void canExpelStudent(Student student) {
        if (student.offendSchoolSystem()) {
            System.out.printf("Student %s expelled.\n", student.getName());
        } else {
            System.out.printf("Student %s not expelled.\n", student.getName());
        }
    }

}

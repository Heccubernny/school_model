package com.heccubernny.Respositories;

import com.heccubernny.Interfaces.IPrincipal;

public class Principal extends Person implements IPrincipal {
    public void admitApplicant(Applicant applicant) {
        if (applicant.getAge() > 10) {
            System.out.printf("Applicant %s admitted.\n", applicant.getName());
        }
    }

    public void expelStudent(Student student) {
        if (student.offendSchoolSystem()) {
            System.out.printf("Student %s expelled.\n", student.getName());
        }
    }

}
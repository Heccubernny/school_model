package com.heccubernny.Interfaces;

import com.heccubernny.Respositories.Applicant;
import com.heccubernny.Respositories.Student;

public interface IPrincipal {

    void admitApplicant(Applicant applicant);

    void expelStudent(Student student);
}
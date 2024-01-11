package com.heccubernny.services;

import com.heccubernny.models.Applicant;
import com.heccubernny.models.Student;

public interface PrincipalService {
    void canAdmitApplicant(Applicant applicant);

    void canExpelStudent(Student student);
}

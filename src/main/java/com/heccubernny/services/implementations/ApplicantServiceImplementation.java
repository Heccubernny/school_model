package com.heccubernny.services.implementations;

import com.heccubernny.models.Applicant;
import com.heccubernny.services.ApplicantService;

public class ApplicantServiceImplementation implements ApplicantService {

    @Override
    public boolean submitApplication(Applicant applicantId) {
        boolean result = (applicantId.getId() >= 12) ? false : true;
        return result;
    }

}

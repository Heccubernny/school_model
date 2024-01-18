package com.heccubernny.services;

import static org.junit.Assume.assumeTrue;

import org.junit.Test;

import com.heccubernny.models.Applicant;
import com.heccubernny.services.implementations.ApplicantServiceImplementation;

public class ApplicantServiceTest {

    @Test
    public void testSubmitApplication() {
        Applicant applicant = new Applicant();

        applicant.setId(10);

        int applicantId = applicant.getId();

        ApplicantService applicantService = new ApplicantServiceImplementation();

        applicantService.submitApplication(applicant);

        Boolean result = (applicantId >= 12) ? false : true;

        assumeTrue(result);

    }
}

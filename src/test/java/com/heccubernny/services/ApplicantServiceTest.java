package com.heccubernny.services;

import com.heccubernny.models.Applicant;
import com.heccubernny.services.implementations.ApplicantServiceImplementation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ApplicantServiceTest {

    @Test
    public void testSubmitApplicationWithValidApplicantId() {
        ApplicantServiceImplementation service = new ApplicantServiceImplementation();
        Applicant applicant = new Applicant("John", 10);
        assertTrue(service.submitApplication(applicant));
    }

    @Test
    public void testSubmitApplicationWithInvalidApplicantId() {
        ApplicantServiceImplementation service = new ApplicantServiceImplementation();
        Applicant applicant = new Applicant("Ade", 15);
        assertFalse(service.submitApplication(applicant));
    }
}

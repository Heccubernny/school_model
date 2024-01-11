package com.heccubernny.tests.Respositories;

import org.junit.Test;

import com.heccubernny.models.Course;

public class StudentTest {
    @Test
    public void testTakeCourse(Course course) {
        assert("ddd", "Mr John is taking Mathematics course.");
    }

}
package com.heccubernny.services;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

// import org.junit.jupiter.api.Test;
import org.junit.Test;
import com.heccubernny.models.Course;
import com.heccubernny.services.implementations.StudentServiceImplementation;

public class StudentServiceTest {
    @Test
    public void testTakeCourse() {

        // Arrange
        Course course = new Course();
        course.setName("Student");
        StudentService studentService = new StudentServiceImplementation();

        // Act
        studentService.takeCourse(course);

        // Assert
        assertTrue(true);
    }

    @Test
    public void testOffendSchoolSystem() {
        // Arrange
        StudentService studentService = new StudentServiceImplementation();

        // Act
        Boolean result = studentService.offendSchoolSystem();

        // Assert
        assertTrue(result);
    }
}
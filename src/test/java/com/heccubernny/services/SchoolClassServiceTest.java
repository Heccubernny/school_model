package com.heccubernny.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.heccubernny.models.Teacher;
import com.heccubernny.services.implementations.SchoolClassServiceImplementation;

public class SchoolClassServiceTest {

    private SchoolClassService schoolClassService;
    private Teacher teacher;

    @Before
    public void setUp() {
        schoolClassService = new SchoolClassServiceImplementation();
        teacher = new Teacher("John Doe", 40, "Mathematics", 12, "M.SC");
    }

    @Test
    public void testSetTeacher() {
        schoolClassService.setTeacher(teacher);

        // Ensuring that the teacher was assigned successfully
        assertNotNull(((SchoolClassServiceImplementation) schoolClassService).getTeacher(teacher));
        assertEquals("John Doe", ((SchoolClassServiceImplementation) schoolClassService).getTeacher(teacher).getName());
    }
}

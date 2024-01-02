package com.heccubernny.Interfaces;

import com.heccubernny.Respositories.Course;

@FunctionalInterface
public interface ITeacher {
    void teachCourse(Course course);
}
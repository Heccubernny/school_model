package com.heccubernny.Interfaces;

import com.heccubernny.Respositories.Course;

@FunctionalInterface
public interface IStudent {
    void takeCourse(Course course);
}
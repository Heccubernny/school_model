package com.heccubernny.models;

public class Student extends Person {

    private Course course;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the course
     */
    public Course getCourse() {
        return this.course;
    }

    /**
     * @param course2 the course to set
     */
    public void setCourse(Course course) {
        this.course = course;
    }

    public boolean offendSchoolSystem() {
        return true;
    }

}

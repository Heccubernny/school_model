package com.heccubernny.models;

public class Student extends Person {

    private String course;

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

}

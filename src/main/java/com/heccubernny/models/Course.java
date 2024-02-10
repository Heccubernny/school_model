package com.heccubernny.models;

public class Course {
    private String name;
    private String code;
    private String courseId;
    private String courseName;

    // Constructor, getters, setters
    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public Course() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param code the course code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean removeCourseById(String courseId) {
        if (this.courseId.equals(courseId)) {
            return true; // Found and removed the course
        }
        return false; // Course not found
    }
}

package com.heccubernny.models;

/**
 * Teacher
 */
public class Teacher extends Person {
    private String courseName;
    private int yearsOfExperience;
    private String qualification;

    // Constructors (you might want to include constructors for flexibility)
    public Teacher(String name, int age, String courseName, int yearsOfExperience, String qualification) {
        super(name, age);
        this.courseName = courseName;
        this.yearsOfExperience = yearsOfExperience;
        this.qualification = qualification;
    }

    public Teacher() {
        // TODO Auto-generated constructor stub
    }

    // Getter and Setter methods
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    // Additional methods related to a teacher's responsibilities could be added
    // here
}

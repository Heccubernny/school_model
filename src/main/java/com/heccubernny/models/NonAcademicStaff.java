package com.heccubernny.models;

public class NonAcademicStaff extends Person {

    public NonAcademicStaff(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }

    private String id;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

}

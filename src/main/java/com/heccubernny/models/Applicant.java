package com.heccubernny.models;

public class Applicant extends Person {
    public Applicant(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }

    public Applicant() {
        // TODO Auto-generated constructor stub
    }

    private int id;

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

}

package com.heccubernny.models;

public class Principal extends Person {
    public Principal(String name, int age) {
        super(name, age);
    }

    private String qualifications;

    /**
     * @return the qualifications
     */
    public String getQualifications() {
        return qualifications;
    }

    /**
     * @param qualifications the qualifications to set
     */
    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

}

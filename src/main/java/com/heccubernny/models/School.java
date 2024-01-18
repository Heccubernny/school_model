package com.heccubernny.models;

public class School {
    private String name;
    private String address;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
        System.out.printf("%s is set \n", this.name);
    }

    /**
     * @param address the age to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

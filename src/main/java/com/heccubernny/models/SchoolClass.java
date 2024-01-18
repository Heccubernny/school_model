package com.heccubernny.models;

/**
 * SchoolClass
 */
public class SchoolClass {
    private String name;
    private int number;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
        System.out.printf("%s is set \n", this.name);
    }

    /**
     * @param number the age to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
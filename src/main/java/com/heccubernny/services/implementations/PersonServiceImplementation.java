package com.heccubernny.services.implementations;

import com.heccubernny.services.PersonService;

public class PersonServiceImplementation implements PersonService {

    /**
     *
     */

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @return the age
     */
    @Override
    public int getAge() {
        return age;
    }

    private String name;
    private int age;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
        System.out.printf("%s is set \n", this.name);
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

}
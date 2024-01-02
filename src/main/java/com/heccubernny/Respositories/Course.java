package com.heccubernny.Respositories;

import com.heccubernny.Interfaces.ICourse;

public class Course implements ICourse {
    String name;

    public void setName(String name) {
        this.name = name;
        System.out.printf("Name set for %s \n", name);
    }

    public String getName() {
        return name;
    }
}

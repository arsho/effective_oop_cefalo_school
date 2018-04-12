package com.cefalo.school;


public class Project implements BaseCalculator {

    private String name;

    public Project(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

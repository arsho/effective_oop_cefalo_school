package com.cefalo.school;

import com.cefalo.school.calculator.Impact;
import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;

public class Individual {

    protected String name;
    protected String role;
    protected int salary;
    protected Score score;
    protected Impact impact;

    Individual(String name, String role, int salary, Score personScore) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.impact = new ImpactFactory().getImpact(this.role);
        this.score = personScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

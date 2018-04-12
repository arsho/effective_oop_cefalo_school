package com.cefalo.school;


import com.cefalo.school.calculator.Impact;
import com.cefalo.school.calculator.ReviewCalculator;
import com.cefalo.school.calculator.Score;

public class Individual {

    private String name;
    private String role;
    private int salary;
    private Score score;
    private Impact impact;

    Individual(String name, String role, int salary, Score personScore) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.impact = new ImpactFactory().getImpact(this.role);
        this.score = personScore;
    }

   

    public double calculateSalary() {
        ReviewCalculator review = new ReviewCalculator(this.salary, this.score, this.impact);
        return review.calculate();
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

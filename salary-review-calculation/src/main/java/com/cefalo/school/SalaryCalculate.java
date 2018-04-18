package com.cefalo.school;

import com.cefalo.school.calculator.ReviewCalculator;

public class SalaryCalculate {

    public double calculateTeamSalary(Team team) {
        double total = 0;
        for (Individual i : team.teamMembers) {
            total += this.calculateIndivisualSalary(i);
        }
        total += this.calculateIndivisualSalary(team.teamLead);
        return total;
    }

    public double calculateIndivisualSalary(Individual individual) {
        ReviewCalculator review = new ReviewCalculator(individual.salary, individual.score, individual.impact);
        return review.calculate();
    }

    public double calculateProjectSalary(Project project) {
        double total = 0;
        for (Team t : project.teams) {
            total += this.calculateTeamSalary(t);
        }
        total += this.calculateIndivisualSalary(project.projectLead);
        return total;
    }

}
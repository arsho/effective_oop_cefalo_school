package com.cefalo.school;

import com.cefalo.school.calculator.Score;

public class App {

    public static void main(String[] args) {
        SalaryCalculate salaryCalculator = new SalaryCalculate();
        Score score1 = new Score(8, 3, 2, 7, 10);
        Score score2 = new Score(8, 3, 2, 7, 10);

        Individual member1 = new Individual("david", RoleType.DEVELOPER, 21312, score1);
        Individual member2 = new Individual("adam", RoleType.DEVELOPER, 41232, score2);
        Individual member4 = new Individual("james", RoleType.DEVELOPER, 41232, score2);
        Individual member3 = new Individual("fox", RoleType.DEVELOPER, 21312, score1);

        Individual tl1 = new Individual("bob", RoleType.TEAM_LEAD, 45000, score2);
        Individual tl2 = new Individual("farguson", RoleType.TEAM_LEAD, 42000, score1);

        Individual pl1 = new Individual("alex", RoleType.PROJECT_MANAGER, 60000, score2);

        Team nhstGlobal = new Team("NHST Global");
        nhstGlobal.addMember(member1);
        nhstGlobal.addMember(member2);
        nhstGlobal.setTeamLead(tl1);

        Team nhstDN = new Team("NHST DN");
        nhstDN.addMember(member3);
        nhstDN.addMember(member4);
        nhstDN.setTeamLead(tl2);

        Project nhst = new Project("NHST");
        nhst.addTeam(nhstDN);
        nhst.addTeam(nhstGlobal);

        nhst.addProjectLead(pl1);

        System.out.println("Indivisual Salary for Member One");
        System.out.println(salaryCalculator.calculateIndivisualSalary(member1));

        System.out.println("Indivisual Salary for Member Two");
        System.out.println(salaryCalculator.calculateIndivisualSalary(member2));

        System.out.println("Indivisual Salary for Member Three");
        System.out.println(salaryCalculator.calculateIndivisualSalary(member3));

        System.out.println("Indivisual Salary for Member Four");
        System.out.println(salaryCalculator.calculateIndivisualSalary(member4));

        System.out.println("Indivisual Salary for Team Lead One");
        System.out.println(salaryCalculator.calculateIndivisualSalary(tl1));

        System.out.println("Indivisual Salary for Team Lead Two");
        System.out.println(salaryCalculator.calculateIndivisualSalary(tl2));

        System.out.println("Indivisual Salary for Project Manager");
        System.out.println(salaryCalculator.calculateIndivisualSalary(pl1));

        System.out.println("Team Salary for NHST Global");
        System.out.println(salaryCalculator.calculateTeamSalary(nhstGlobal));

        System.out.println("Team Salary for NHST DN");
        System.out.println(salaryCalculator.calculateTeamSalary(nhstDN));

        System.out.println("Project Salary for NHST ");
        System.out.println(salaryCalculator.calculateProjectSalary(nhst));
    }
}

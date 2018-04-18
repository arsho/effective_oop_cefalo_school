package com.cefalo.school;

import java.util.ArrayList;

public class Project implements BaseCalculator {

    private String name;
    protected ArrayList<Team> teams;
    protected Individual projectLead;

    public Project(String name) {
        this.name = name;
        this.teams = new ArrayList<Team>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProjectLead(Individual projectLead) {
        this.projectLead = projectLead;
    }

    public void addTeam(Team team) {
        this.teams.add(team);
    }
}

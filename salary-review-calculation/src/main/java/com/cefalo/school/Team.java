package com.cefalo.school;

import java.util.ArrayList;

public class Team {

    protected String name;
    protected ArrayList<Individual> teamMembers;
    protected Individual teamLead;

    public Team(String name) {
        this.name = name;
        this.teamMembers = new ArrayList<Individual>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Individual getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Individual teamLead) {
        this.teamLead = teamLead;
    }

    public void addMember(Individual individual) {
        this.teamMembers.add(individual);
    }

}

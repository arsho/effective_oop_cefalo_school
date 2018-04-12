package com.cefalo.school;


import com.cefalo.school.calculator.Impact;

public class ImpactFactory {
    public Impact getImpact(String role){
        Impact impact = null;
        if(role.equals(RoleType.DEVELOPER)){
            impact = new Impact(0.7, 0.7, 0.7, 0.7, 0.7);            
        }
        else if(role.equals(RoleType.TEAM_LEAD)){
            impact = new Impact(0.75, 0.75, 0.75, 0.75, 0.75);            
        }
        else if(role.equals(RoleType.PROJECT_MANAGER)){
            impact = new Impact(0.8, 0.8, 0.8, 0.8, 0.8);            
        }
        else if(role.equals(RoleType.CTO)){
            impact = new Impact(0.9, 0.9, 0.9, 0.9, 0.9);            
        }        
        return impact;
    }
}

package com.cefalo.school;

import com.cefalo.school.calculator.Impact;
import com.cefalo.school.calculator.Score;

public class App {

    public static void main(String[] args) {
        Score score1 = new Score(8, 3, 2, 7, 10);
        Individual member1 = new Individual("david", RoleType.DEVELOPER, 21312, score1);
        Score score2 = new Score(8, 3, 2, 7, 10);
        Individual member2 = new Individual("adam", RoleType.DEVELOPER, 41232, score2);
        Score score3 = new Score(8, 6, 2, 7, 10);
        Individual tl1 = new Individual("bob", RoleType.DEVELOPER, 55122, score2);
        Team nhst = new Team("NHST");
        nhst.addMember(member1);
        nhst.addMember(member2);
        nhst.setTeamLead(tl1);
        System.out.println(nhst.calculate());
    }
}

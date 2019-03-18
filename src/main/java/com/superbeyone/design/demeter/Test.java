package com.superbeyone.design.demeter;

/**
 * @author Mr.superbeyone
 * @project design-pattern
 * @className Test
 * @description 迪米特原则
 * @date 2019-03-18 16:41
 **/

public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.countCheck(teamLeader);

    }
}

package jp.ac.uryukyu.ie.aaaaa;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackTest() {
        int defaultWarriorHp = 100;
        Warrior demoWarrior = new Warrior("デモ勇戦士", defaultWarriorHp, 10);
        Enemy slime = new Enemy("スライムもどき", 100, 10);


        for(int i=0; i<3; i++) {
            int slimeHP = slime.hitPoint;
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(slimeHP - slime.hitPoint, 10 * 1.5);
        }
    }
}

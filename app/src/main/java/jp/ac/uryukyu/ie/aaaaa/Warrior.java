package jp.ac.uryukyu.ie.aaaaa;

public class Warrior extends LivingThing {
/**
 * 戦士クラス。
 *  String name; //戦士の名前
 *  int hitPoint; //戦士のHP
 *  int attack; //戦士の攻撃力
 *  boolean dead; //戦士の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */ 
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        int damage = (int)(attack * 1.5);
        if(hitPoint > 0){
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}

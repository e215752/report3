package jp.ac.uryukyu.ie.aaaaa;

public class Hero extends LivingThing {
/**
 * ヒーロークラス。
 *  String name; //ヒーローの名前
 *  int hitPoint; //ヒーローのHP
 *  int attack; //ヒーローの攻撃力
 *  boolean dead; //ヒーローの生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */    

    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public int getHitPoint() {
        return this.hitPoint;
    }

    @Override
    public void wounded(int damage) {
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}
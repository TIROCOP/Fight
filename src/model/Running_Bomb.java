package model;

public class Running_Bomb extends Monsters {
    private int speed;
    private int extra;


    public Running_Bomb(String name, int hp, int fight_dmg, int speed, int extra) {
        super(name, hp, fight_dmg);
        this.speed = speed;
        this.extra = extra;

    }

    @Override
    public void get_dmg(int dmg) {
        hp -= dmg;
        if (dmg > extra) {
            speed = 0;
        }
        if (hp <= 0) {
            super.die();
        }


    }

    @Override
    public void do_dmg(Monsters monsters) {
        monsters.get_dmg(fight_dmg * speed);
        speed = 1;
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("speed: " + speed);
        System.out.println("extra: " + extra);
    }

}

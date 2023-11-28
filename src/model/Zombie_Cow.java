package model;

public class Zombie_Cow extends Monsters {
    private int hads;

    public Zombie_Cow(String name, int hp, int fight_dmg, int hads) {
        super(name, hp, fight_dmg);
        this.hads = hads;
    }

    @Override
    public void get_dmg(int dmg) {
        super.hp -= dmg;

        if (hp < 40) {
            hp += 20;
            hads -= 1;
        }
        if (hads <= 0) {
//           атаковать + крит и умереть
            fight_dmg += 10;
            super.die();
        }
    }

    @Override
    public void do_dmg(Monsters monsters) {
        int a = (int) (Math.abs(Math.random()) * 5 + (fight_dmg - 5));
        monsters.get_dmg(a);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("kol_hads: " + hads);
    }
}

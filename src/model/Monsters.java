package model;


public abstract class Monsters implements Fight{
    protected String name;
    protected int hp;
    protected int fight_dmg;

    public Monsters(String name, int hp, int fight_dmg) {
        this.name = name;
        this.hp = hp;
        this.fight_dmg = fight_dmg;
    }

    public abstract void get_dmg(int dmg);

    public void die() {
        name = "0";
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("hp: " + hp);
        System.out.println("F_dmg: " + fight_dmg);
    }
}



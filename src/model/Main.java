package model;

public class Main {
    public static void main(String[] args) {
        Zombie_Cow zb_cow = new Zombie_Cow("BURENKA", 300, 15, 3);
        Running_Bomb run_bomb = new Running_Bomb("BOMBERMAN", 50, 5, 1, 15);

        while (zb_cow.name != "0" && run_bomb.name != "0") {
            zb_cow.do_dmg(run_bomb);
            run_bomb.do_dmg(zb_cow);
            System.out.println(".. .. .. ... .");
            zb_cow.printInfo();
            System.out.println(".. .. .. ... .");
            run_bomb.printInfo();
        }
        System.out.println("   \\  ");
        System.out.println("____\\ ");
        System.out.println("____/  ");
        System.out.println("   /  ");

        if (zb_cow.getName() == "0" && run_bomb.getName() == "0") {
            System.out.println("neither - win!");
        } else if (run_bomb.getName() == "0") {
            System.out.println("cow - win!");
        } else {
            System.out.println("bomb - win!");
        }


    }
}

package day9.work.KungFuGame;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰",100,'男');
        Role r2 = new Role("段誉",100,'男');

        r1.showRoleInfo();
        r2.showRoleInfo();
        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0) {
                System.out.println("乔峰赢了");
                break;

            }
        }
    }
}

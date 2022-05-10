package day08;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "Apple";
        p.price = 10000;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.playGame();

    }

}

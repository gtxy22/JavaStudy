package day03.test;

public class Work1 {
    public static void main(String[] args) {
        int hight = 150;
        int hight2 = 210;
        int hight3 = 165;
        int middle = hight < hight2 ? hight2 : hight;
        System.out.println(middle < hight3 ? hight3 : middle);
    }
}
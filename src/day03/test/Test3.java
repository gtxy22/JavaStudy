package day03.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println((s == 6 || num2 ==6 ) || (s + num2)%6 == 0);
        System.out.println();
    }

}

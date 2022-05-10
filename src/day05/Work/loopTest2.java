package day05.Work;

import java.util.Scanner;

public class loopTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        for (int i = 0; i < num1; i++) {
            if(i * i == num1){
                System.out.println(i);
                break;
            } else if (i * i > num1) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}

package day05.Work;

import java.util.Random;
import java.util.Scanner;

public class loopTest07 {
    public static void main(String[] args) {
        Random r  = new Random();
        int n = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true){
            int guessNumber = sc.nextInt();
            if (guessNumber > n ){
                System.out.println("猜的数字大了。。。。");
            } else if (guessNumber ==n) {
                System.out.println("你猜对了");
                break;
            } else if (guessNumber < n ){
                System.out.println("猜的数字小了。。。。");
            }
        }


    }
}

package day05.Work;

import java.util.Scanner;

public class loopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int system = sc.nextInt();
        //标记System是否为一个质数
        boolean flag = true;
        for (int i = 2; i <= system -1; i++) {
            if (system % i==0) {
                flag = false;
                break;

            }
        }
        if (flag) {
            System.out.println("输入的数字是质数");
        } else {
            System.out.println("输入的质数不是一个质数");
        }
    }
}

package day05.Work;

import java.util.Scanner;

public class loopTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int system = sc.nextInt();
        //���System�Ƿ�Ϊһ������
        boolean flag = true;
        for (int i = 2; i <= system -1; i++) {
            if (system % i==0) {
                flag = false;
                break;

            }
        }
        if (flag) {
            System.out.println("���������������");
        } else {
            System.out.println("�������������һ������");
        }
    }
}

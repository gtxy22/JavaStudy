package day10.StringDomo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class StringDomo4 {
    public static void main(String[] args) {

        String rightUserName = "zhangsan";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("�������û�����");
            String userName = sc.next();
            System.out.println("���������룺");
            String password = sc.next();
            if (userName.equals(rightUserName) && password.equals(rightPassword)) {
                System.out.println("��¼�ɹ���");
                break;
            }else {
                System.out.printf("��¼ʧ�ܣ�����ʣ��%d�λ��ᣡ\n",2-i);
            }
        }
    }
}

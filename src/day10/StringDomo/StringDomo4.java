package day10.StringDomo;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class StringDomo4 {
    public static void main(String[] args) {

        String rightUserName = "zhangsan";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String userName = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            if (userName.equals(rightUserName) && password.equals(rightPassword)) {
                System.out.println("登录成功！");
                break;
            }else {
                System.out.printf("登录失败！您还剩下%d次机会！\n",2-i);
            }
        }
    }
}

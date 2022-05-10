package day10.StringDomo;

import java.util.Scanner;

public class StringDomo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入一个字符串：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("输入无效");
            }

        }
        String moneyStr = "";
        while (true) {
            int ge = money % 10;
           String captialNumber = getCaptialNumber(ge);
            moneyStr =   captialNumber + moneyStr;
            System.out.println(ge);
            money = money / 10;
            if (money == 0) {
                break;
            }
        }
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
        //定义一个单位数组
        int len = moneyStr.length();
        String result = "";
        String[] arr = { "佰", "拾",  "万", "仟","佰", "拾", "元"};
        for (int i = 0; i < len ; i++) {
            char c = moneyStr.charAt(i);
            result = result+ c + arr[i];
        }
        System.out.println(result);
    }
    public static String getCaptialNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
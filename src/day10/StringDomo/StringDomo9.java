package day10.StringDomo;

import java.util.Scanner;

public class StringDomo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("������һ���ַ�����");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("������Ч");
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
            moneyStr = "��" + moneyStr;
        }
        //����һ����λ����
        int len = moneyStr.length();
        String result = "";
        String[] arr = { "��", "ʰ",  "��", "Ǫ","��", "ʰ", "Ԫ"};
        for (int i = 0; i < len ; i++) {
            char c = moneyStr.charAt(i);
            result = result+ c + arr[i];
        }
        System.out.println(result);
    }
    public static String getCaptialNumber(int number) {
        String[] arr = {"��", "Ҽ", "��", "��", "��", "��", "½", "��", "��", "��"};
        return arr[number];
    }
}
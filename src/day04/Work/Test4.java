package day04.Work;

import java.sql.SQLOutput;

public class Test4 {
    public static void main(String[] args) {

        int x = 12321;
        //����һ����ʱ�������������淴��������������
        int temp = x;
        int num = 0;
        while (x != 0) {
            int ge = x % 10;
            //ȥ���ұߵ�����
            x = x / 10;
            num = num * 10 +ge ;
        }
        System.out.println(num);
        System.out.println(num ==temp);
    }

}

package day04.Work;

import java.sql.SQLOutput;

public class Test4 {
    public static void main(String[] args) {

        int x = 12321;
        //定义一个临时变量用来给后面反过来的数做对照
        int temp = x;
        int num = 0;
        while (x != 0) {
            int ge = x % 10;
            //去掉右边的数字
            x = x / 10;
            num = num * 10 +ge ;
        }
        System.out.println(num);
        System.out.println(num ==temp);
    }

}

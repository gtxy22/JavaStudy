package day07.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + 1);

            } else {
                chs[i] = (char) +(65 + i - 25);
            }
        }
        Random r = new Random();
        //定义一个字符串记录最终的结果
        String res = "";
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);

            //            System.out.println(chs[randomIndex]);
        res = res + chs[randomIndex];

        }
        int n = r.nextInt(10);
        res = res + n;
        System.out.println(res);
        //利用随机索引获取对应元素
    }

}

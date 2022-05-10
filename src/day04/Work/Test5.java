package day04.Work;

public class Test5 {
    public static void main(String[] args) {
        //不使用乘法除法 % 来确定数字商和余数'
        // 被除数
        int num1 = 123;
//        除数
        int num2 = 10;
//        商，用来递增
        int num3 = 0;
        while (num1 > num2){
            num1 -= num2;
            num3++;
        }
        System.out.println("商是" + num3 + " 余数是" + num1);
    }
}

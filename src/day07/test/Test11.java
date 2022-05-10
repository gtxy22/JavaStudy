package day07.test;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
    int[] arr = userInputNumber();
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");

    }
    int redCount = 0;
    int blueCount = 0;
        for (int i = 0; i < arr.length -1; i++) {
            int redNumber = arr[i];
            for (int j = 0; j < arr.length -1; j++) {
                if (arr[j] == redNumber){
                    redCount++;
                    //如果找到了，就跳出循环，后面的不用再找了
                    break;
                }
            }
        }
        int blueNumber = arr[6];
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == blueNumber){
                blueCount++;
            }
        }
        System.out.println(redCount);
        System.out.println(blueCount);
    }
    public static int[] createNumber(){
        int[] arr = new int[7];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int temp = random.nextInt(33) +1 ;
        }
        return arr;
    }
    public static int[] userInputNumber(){
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("请输入红球号码");
            int redNumber = sc.nextInt();
            if (redNumber >= 1&& redNumber<= 33){
                boolean flag = contains(arr,redNumber);
                if(!flag){
                   arr[i] = redNumber;
                }else {
                    System.out.println("重复，请重新输入");
                }
            }else {
                System.out.println("输入有误，请重新输入");
            }

        }
        System.out.println("请输入蓝球号码");
        while (true){
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 && blueNumber <= 16){
                arr[6] = blueNumber;
                break;
            } else {
                System.out.println("输入有误，请重新输入");
            }
        }
        return arr;
    }
    public static boolean contains(int[] arr ,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}

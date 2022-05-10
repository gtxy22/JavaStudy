package day05.Work;

import java.util.Random;

public class ArrTest9 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randonIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randonIndex];
            arr[randonIndex]= temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

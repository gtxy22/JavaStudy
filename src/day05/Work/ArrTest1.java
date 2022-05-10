package day05.Work;

public class ArrTest1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
         temp += arr[i];
        }
        System.out.println(temp);
    }
}

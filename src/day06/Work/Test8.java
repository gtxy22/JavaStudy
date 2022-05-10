package day06.Work;

public class Test8 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr1 =copyOfRange(arr,2,4);
        System.out.println(arr1);
    }
    public static int[] copyOfRange(int[] arr,int from , int to){
      int[] arr1 = new int[to - from];
      int temp = 0;
        for (int i = from; i < to; i++) {
            arr1[1] = arr[i];
            temp++;


        }
        return arr1;
    }
}

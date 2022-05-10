package day06.Work;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int max = getMax(arr);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] ==max){
                max = arr[i];
            }
        }

        return max;
    }
}

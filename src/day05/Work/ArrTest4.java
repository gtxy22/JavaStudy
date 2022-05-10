package day05.Work;

public class ArrTest4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int left = 0 ,right = arr.length -1;left <right ; left ++
                ,right--){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

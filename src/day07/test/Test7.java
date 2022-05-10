package day07.test;

public class Test7 {
    public static void main(String[] args) {

    }
    public static int numberLen(int number){
        int count = 0;
        while (number != 0){
            number = number / 10;
            count++;
        }
        return count ;
    }

    public static int[] separateNumber(int number, int len) {
        int[] arr = new int[len];
        int index = len-1;
        while (number != 0){
        int ge = number % 10;
        number = number / 10;
        arr[index] = ge ;
        index--;
        }
    return arr;
    }
    public static  void getSlice(int[] number){
        for (int i = 0; i < number.length -1; i++) {
            number[i] = number[i]+5;
        }
    }
}

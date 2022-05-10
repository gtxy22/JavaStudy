package day10.work;

public class Test2Case2 {
    public static void main(String[] args) {
        String stra = "abcdef";
        String strb = "cdbefa";
    }

    public static String rotate(String str) {
        char[] arr = str.toCharArray();
        char first = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = first;
        String result = new String(arr);
        return result;
    }


}


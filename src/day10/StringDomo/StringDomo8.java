package day10.StringDomo;

public class StringDomo8 {
    public static void main(String[] args) {
    reverser("Hello");

    }

    public static String reverser(String str){
        String result = "";
        for (int i = str.length() -1; i >= 0; i--) {
        char c = str.charAt(i);
        result += c;
        }
        return result;
    }

}

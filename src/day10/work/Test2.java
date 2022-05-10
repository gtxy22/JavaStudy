package day10.work;

public class Test2 {
    public static void main(String[] args) {
        String stra = "abcdef";
        String strb = "cdbefa";
        boolean result = check(stra,strb);
        System.out.println(result);
    }
    public static boolean check(String strA, String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA= rotate(strA);
            if (strA == strB){
                return true;
            }


        }
        return false;

    }
    public static String rotate(String str){
        char first = str.charAt(0);
        String end = str.substring(1);
        return end + first;
    }

}

package day10.StringDomo;

public class StringDomo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);

        String s2 = new String();
        System.out.println(1 + s2 + 2);

        String s3 = new String("abc");
        System.out.println(s3);

        char[] chs = {'a', 'b', 'c'};
        String s4 = new String(chs);
        System.out.println(s4);

        boolean result1 = s1.equals(s3);
        boolean result2 = s1.equalsIgnoreCase(s3);
        System.out.println(result1);
        System.out.println(result2);
    }
}
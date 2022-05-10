package day10.StringBuilderDomo;

public class StringBuilderDomo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
//        sb.append("Hello");
//        sb.append(" ");
//        sb.append("World");
//        sb.append("!");

        sb.reverse();

        System.out.println(sb);
        int len = sb.length();
        System.out.println(len);

    }
}

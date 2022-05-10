package day10.StringJoinerDomo;

import java.util.StringJoiner;

public class StringJoinerDomo1 {
    public static void main(String[] args) {
        StringJoiner sj =  new StringJoiner("， ","[","]");
        sj.add("Java").add("C++").add("C#");
        System.out.println(sj);
        System.out.println(sj.toString());
    }
}

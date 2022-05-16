package day12.upStudentSystem;

import java.util.ArrayList;
import java.util.Random;

public class test {
    public static void main(String[] args) {
/*        ArrayList<Character> list = new ArrayList<>();
//        把字母添加到list集合中
        for (char i = 0; i < 26; i++) {
            list.add((char) ('a' + i));
            list.add((char) ('A' + i));

        }
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(list.size());
            char c = list.get(index);
            sb.append(c);
            System.out.println(c);
        }
        int result = r.nextInt(10);
        //追加数字到最后一位之后打乱顺序
        sb.append(result);
        char[] chars = sb.toString().toCharArray();
        int index = r.nextInt(chars.length-1);
        char temp = chars[index];
        chars[index] = chars[chars.length-1];
        chars[chars.length-1] = temp;*/
        user u = new user("zhangsan", null,null,null);
        ArrayList<user> list = new ArrayList<>();
        list.add(u);
        System.out.println(contains(list,"zhangsan"));
        System.out.println(contains2(list,"zhangsan"));

    }
    private static boolean contains(ArrayList<user> list, String userName) {
//       循环遍历list集合，寻找相同的变量名
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            System.out.println(name);
            System.out.println(name.equals(userName));
            if (name.equals(userName)){
                return true;
            }
        }
        return false;
    }
    private static boolean contains2(ArrayList<user> list, String userName) {
//       循环遍历list集合，寻找相同的变量名
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            System.out.println(name);
            System.out.println(name.equals(userName));
            if (name == userName){
                return true;
            }
        }
        return false;
    }
}

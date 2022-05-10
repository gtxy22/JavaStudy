package day11.Test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("点赞了没？");
        list.add("收藏了没？");
        list.add("转发了没？");
        list.add("投币了没？");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() -1){
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");

    }
}

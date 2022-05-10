package day11.ArrayListDomo;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class ArrayListDomo2 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);

        //remove
/*        boolean res = list.remove("aaa");
        System.out.println(res);
        boolean res1 = list.remove("ddd");
        System.out.println(res1);
        String str = list.remove(0);;
        System.out.println(str);*/
//        String res = list.set(1,"ddd");
       String str =  list.get(0);
        System.out.println(str);
        for (int i = 0; i < list.size(); i++) {
            String str2=  list.get(i);
            System.out.println(str2);
        }
    }
}

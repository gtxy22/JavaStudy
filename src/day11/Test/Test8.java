package day11.Test;

import java.util.ArrayList;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("锤子",2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> res = getPhoneInofo(list);
        for (int i = 0; i < res.size(); i++) {
            Phone phone = res.get(i);
            System.out.println(phone.getBrand()+","+phone.getPrice());
        }

    }
    public static  ArrayList<Phone> getPhoneInofo(ArrayList<Phone> list){
        ArrayList<Phone> res = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            if (price< 3000) {
                res.add(p);
            }
        }
        return res;
    }
}

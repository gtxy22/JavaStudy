package day9.work.Store.Goods;

import day9.work.Store.Goods.Goods;

public class GoodTest {
    public static void main(String[] args) {


        Goods[] arr = new Goods[3];
        Goods g1 = new Goods("001", "Æ»¹û", 5599.0, 100);
        Goods g2 = new Goods("002", "±£ÎÂ±­", 227.0, 50);
        Goods g3 = new Goods("002", "èÛè½", 12.7, 70);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;
        for (int i = 0; i < arr.length; i++) {
            Goods good = arr[i];
            System.out.println(good.getId() + " " + good.getName() + " " + good.getPrice() + " " + good.getCount());
        }
        }
    }

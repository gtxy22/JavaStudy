package day11.Test;

import java.util.ArrayList;

public class Test7 {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();
        user u1 = new user("张三","123456","heima001");
        user u2 = new user("李四","12345678","heima002");
        user u3 = new user("王五","123456qwer","heima003");
        list.add(u1);
        list.add(u2);
        list.add(u3);

    }
    public static int gerIndex(ArrayList<user> list,String id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().equals(id)){
                return i;
            }
        }
        return -1;
    }
}

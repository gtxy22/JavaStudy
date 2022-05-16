package day12.upStudentSystem;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class StudentDomo {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作1登录 2注册 3忘记密码");
        String chiose = sc.next();
        switch (chiose) {
            case "1"-> login(list,sc);
            case "2"-> register(list,sc);
            case "3"-> forgetPassword(list,sc);
        }
    }
    }
//    忘记密码的方法
    public static void forgetPassword(ArrayList<user> list,Scanner sc){
//        判断用户名是否存在
        String userName = null;
        while (true) {
            System.out.println("请输入用户名");
            userName = sc.next();
            if (!contains(list, userName)) {
                System.out.println("用户名不存在");
            }
//            如果用户名存在，输入身份证号码和手机号码
            System.out.println("请输入身份证号码");
            String personID= sc.next();
            System.out.println("请输入手机号码");
            String phone = sc.next();
            int index = findIndex(list, userName);
            if (!list.get(index).getId().equals(personID) && list.get(index).getpNumber().equals(phone)){
                System.out.println("身份证号码或手机号码错误");
                return;
            }
                String newPassword = null;
            while (true) {
                //修改密码
                System.out.println("请输入新密码");
                newPassword = sc.next();
                System.out.println("请再次输入新的密码");
                String newPassword2 = sc.next();
                if (newPassword.equals(newPassword2)) {
                    break;
                } else {
                    System.out.println("两次密码不一致");
                }

            }
            list.get(index).setPassword(newPassword);
            System.out.println("修改成功");
            break;
        }

    }

    private static int findIndex(ArrayList<user> list, String userName) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(userName)){
                return i;
            }
        }
        return -1;
    }

    //    注册的方法
    public static void register(ArrayList<user> list,Scanner sc){
        //用户名
        String userName = null;
        while (true) {
            System.out.println("请输入用户名");
            userName = sc.next();
            boolean flag = checkUserName(userName);
                //判断用户名是否符合规范`
            if (!flag){
                System.out.println("用户名格式不符合规范");
                continue;
            }
//                格式已经满足条件了，判断用户名唯一性
           boolean flag2 = contains(list,userName);
            if (flag2){
//                true 说明存在
                System.out.printf("当前用户名%s已存在，请重新输入\n",userName);
            } else {
                System.out.printf("当前用户名%s可用\n",userName);
                break;
            }
        }
//        密码
        String Password=null;
        while (true) {
            System.out.println("请输入密码账号的密码");
            Password=sc.next();
            System.out.println("请输入再次密码账号的密码");
            String againPassword=sc.next();
            if (!Password.equals(againPassword)){
                System.out.println("两次密码输不一致，请重新输入");
                continue;
            }
            break;
        }
//        身份证号
        String id=null;
        while (true){
            System.out.println("请输入身份证号码");
            id = sc.next();
            boolean flag = checPersonID(id);
            if (flag){
                System.out.println("身份证号码格式正确");
                break;
            } else {
                System.out.println("身份证号码格式不正确，请重新输入");
            }

        }
//        手机号
        String phone=null;
            while (true){
                System.out.println("请输入手机号码");
                phone = sc.next();
                boolean flag = checkPhone(phone);
                if (flag){
                    System.out.println("手机号码格式正确");
                    break;
                } else {
                    System.out.println("手机号码格式不正确，请重新输入");
                    continue;
                }
            }
//            new user 添加到list集合中
        user user = new user(userName,Password,id,phone);
        list.add(user);
        System.out.println("注册成功");
//        调用函数遍历list集合
        printlist(list);

    }

    private static void printlist(ArrayList<user> list) {
        for (int i = 0; i < list.size(); i++) {
            //遍历用户信息
            System.out.printf("用户名：%s,密码 %s，身份证 %s 手机号%s\n",list.get(i).getName(),list.get(i).getPassword(),
                    list.get(i).getId(),list.get(i).getpNumber());
        }
    }

    //校验手机号
    public static boolean checkPhone(String phone) {
        int length = phone.length();
        if (length != 11){
            return false;
        }
    boolean b = phone.startsWith("0");
        if (b){
            return false;
        }
        for (int i = 0; i < length; i++) {
            char c = phone.charAt(i);
            if (c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }

    //校验身份证号码
    private static boolean checPersonID(String id) {
        int length = id.length();
        if (!(length == 18)){
            return false;
        }
       boolean flag = id.startsWith("0");
        if (flag){
//            如果以零开头，则为false
            return false;
        }
//        判断前十七位必须为数字
        for (int i = 0; i < 17; i++) {
            char c = id.charAt(i);
            if (!(c >= '0'&& c <='9')){
                return false;
            }
        }
        char c = id.charAt(17);
        if (((c != 'x' )&& ( c != 'X') && (c <'0' || c>'9')) ){
            return false;
        }
        return true;
    }

    //寻找相同的变量名
    private static boolean contains(ArrayList<user> list, String userName) {
//       循环遍历list集合，寻找相同的变量名
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            if (name.equals(userName)){
                return true;
            }
        }
        return false;
    }

    //校验长度和规范（格式）
    private static boolean checkUserName(String userName) {
        int length = userName.length();
        if (length<3||length>15){
            System.out.println("用户名长度不符合规范");
            return false;
        }

        //count 记录字母的值，检验用户名不能为纯数字
        int count = 0;
        for (int i = 0; i < length; i++) {

            char c = userName.charAt(i);

            if (!(c>='a'&&c<='z'||c>='A'&&c<='Z'||c>='0'&&c<='9')){
                return false;
            } else if ((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
                count++;
                break;

            }

        }
        //当执行到这里的时候，密码的格式对了，下面来判断是否为纯数字
        return count != 0;


    }

    //    登录的方法
    public static void login(ArrayList<user> list,Scanner sc) {
        int i = 0;
        while (i == 2){
            System.out.println("请输入用户名");
            String userName = sc.next();
            boolean flag = contains(list,userName);
            if (!flag){
                System.out.println("用户名不存在");
                return;
            }
            System.out.println("请输入密码");
            String password = sc.next();
                while (true) {
                String code = getCode();
                System.out.println("验证码为："+code);
                System.out.println("请输入验证码");
                String code1 = sc.next();
                if (code.equals(code1)){
                    System.out.println("验证码 正确");
                    break;
                }else{
                    System.out.println("验证码错误");
                }

            }
//                传递用户名和密码，封装成一个user对象整体传递，让代码更加简洁
            user userInfo = new user(userName,password,null,null);
            boolean flag2 = chhckUserName(list,userInfo);
            if (flag2){
                System.out.println("登录成功");
                return;
            }else{
                System.out.println("登录失败,还剩下"+(2-i)+"次机会");
                i++;
            }
        }
    }

    private static boolean chhckUserName(ArrayList<user> list,user userInfo) {
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            if (userInfo.getName().equals(name) && userInfo.getPassword().equals(list.get(i).getPassword())){
                return true;

            }
        }
        return false;
    }

    //    生成一个五位验证码
    public static String getCode() {
        ArrayList<Character> list = new ArrayList<>();

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
        chars[chars.length-1] = temp;
        return new String(chars);
    }

}

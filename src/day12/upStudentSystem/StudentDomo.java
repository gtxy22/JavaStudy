package day12.upStudentSystem;

import java.util.Scanner;

public class StudentDomo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("欢迎来到学生管理系统");
        System.out.println("请选择操作1登录 2注册 3忘记密码");
        String chiose = sc.next();
        switch (chiose) {
            case "1": login();
            case "2": register();
            case "3": forgetPassword();
        }
    }
    }
//    忘记密码的方法
    public static void forgetPassword(){

    }
//    注册的方法
    public static void register(){

    }
//    登录的方法
    public static void login(){

    }
}

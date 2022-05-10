package day11.StudentSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("----------欢迎来到黑马学生管理系统----------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择：");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "1"-> StudentSystem.addStudent(students );
                case "2"->StudentSystem.deleteStudent(students);
                case "3"->StudentSystem.updateStudent(students);
                case "4"->StudentSystem.queryStudent(students);
                case "5"->{
                    System.out.println("退出");
                    break loop;
                }
                default->System.out.println("输入错误，请重新输入");
            }
        }
    }
    public static void addStudent( ArrayList<Student> students ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的id：");
        String   id = sc.next();
        if (isEmpty(students, id)) {
            System.out.println("该学生已存在");
            return;
        }
        System.out.println("请输入学生的姓名：");
        String   name = sc.next();
        System.out.println("请输入学生的年龄：");
        int      age = sc.nextInt();
        System.out.println("请输入学生的家庭住址：");
        String   address = sc.next();
        Student  student = new Student(id, name, age, address);
        students.add(student);
        System.out.println("添加成功");
    }
    public static void deleteStudent( ArrayList<Student> students ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的id：");
        String   id = sc.next();
        int      index = getIndex(students, id);
        if (index == -1) {
            System.out.println("没有该学生");
        } else {
            students.remove(index);
        }
    }
    public static void updateStudent( ArrayList<Student> students ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的id：");
        String   id = sc.next();
        int      index = getIndex(students, id);
        if (index == -1) {
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }
        //代码执行到这里，说明要修改的id存在
//        获取要修改的学生对象
        Student student = students.get(index);
        System.out.println("请输入学生的姓名：");
        String   newName = sc.next();
        student.setName(newName);
        System.out.println("请输入学生的年龄：");
        int      newAge = sc.nextInt();
        student.setAge(newAge);
        System.out.println("请输入学生的家庭住址：");
        String   newAddress = sc.next();
        student.setAddress(newAddress);
        System.out.println("修改成功");
    }
    public static void queryStudent( ArrayList<Student> students ) {
        if (students.size() == 0) {
            System.out.println("没有学生");
            return;
        }
        System.out.println("id\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAddress());
        }
    }
    public static boolean isEmpty( ArrayList<Student> students, String id ) {
/*        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId().equals(id)) {
                return  true;
            }
        }
        return false;*/
        return getIndex(students, id) != -1;
    }

    public static int getIndex( ArrayList<Student> students, String id ) {
//        遍历集合
        for (int i = 0; i < students.size(); i++) {
//            得到没一个学生对象
            Student student = students.get(i);
//
            if (student.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}

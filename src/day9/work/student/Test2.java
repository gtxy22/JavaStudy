package day9.work.student;

public class Test2 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "����", 18);
        Student stu2 = new Student(2, "����", 24);
        Student stu3 = new Student(3, "����", 25);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        int index = Id(1, arr);
        if (index != -1) {
            arr[index] = null;
        } else{
            System.out.println("û���ҵ�");

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
        }
    }
        public static int Id ( int id, Student[] arr){
            for (int i = 0; i < arr.length; i++) {
                Student stu = arr[i];
                if (stu != null) {
                    if (stu.getId() == id) {
                        return i;
                    }
                }
            }
            return -1;
        }

}
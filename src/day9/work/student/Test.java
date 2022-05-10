package day9.work.student;

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1, "张三", 18);
        Student stu2 = new Student(2, "李四", 24);
        Student stu3 = new Student(3, "王五", 25);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        Student stu4 = new Student(4, "赵六", 25);
        if (contains(stu4.getId(), arr)) {
            System.out.println("存在");

        } else {
            System.out.println("不存在");
            int count = getCount(arr);
            if (count == arr.length) {
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            }else {
                arr[count] = stu4;
                printArr(arr);
            }
        }



    }
    //遍历student数组
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if((stu != null)) {
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge());
            }
        }
    }
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length +1];
        for (int i = 0; i < arr.length; i++) {
            //把老数组的元素添加到
            newArr[i] = arr[i];
        }
        return newArr;

    }
        public static int getCount(Student[]arr){
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    count++;
                }
            }
            return count;

        }
        public static boolean contains ( int id, Student[] arr) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    if (arr[i].getId() == id) {
                        return true;
                    }
                }

            }
            return false;
        }

}

package day9.work.Store.Phone;

public class PhoneTest {
    public static void main(String[] args) {


        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("С��", 1999, "��ɫ");
        Phone p2 = new Phone("����", 4999, "��ɫ");
        Phone p3 = new Phone("��Ϊ", 3999, "��ɫ");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            Phone phone = arr[i];
            sum += phone.getPrice();
        }
        int avg = sum / arr.length;
        System.out.println(avg);
    }
}
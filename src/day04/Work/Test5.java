package day04.Work;

public class Test5 {
    public static void main(String[] args) {
        //��ʹ�ó˷����� % ��ȷ�������̺�����'
        // ������
        int num1 = 123;
//        ����
        int num2 = 10;
//        �̣���������
        int num3 = 0;
        while (num1 > num2){
            num1 -= num2;
            num3++;
        }
        System.out.println("����" + num3 + " ������" + num1);
    }
}

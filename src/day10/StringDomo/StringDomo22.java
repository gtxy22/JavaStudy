package day10.StringDomo;

import javax.lang.model.element.AnnotationMirror;

public class StringDomo22 {
    public static void main(String[] args) {
        String talk = "�����̫���� �´��벻Ҫ���� tmd  �Լ���sb��˵����sb�ɣ�mlgb";
        String[] arr = {"tmd","cnm","sb","mlgb"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"xxx");
        }

        System.out.println(talk);
    }
}

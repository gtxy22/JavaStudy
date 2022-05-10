package day10.StringDomo;

import javax.lang.model.element.AnnotationMirror;

public class StringDomo22 {
    public static void main(String[] args) {
        String talk = "你玩的太好了 下次请不要玩了 tmd  自己是sb还说别人sb吧？mlgb";
        String[] arr = {"tmd","cnm","sb","mlgb"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"xxx");
        }

        System.out.println(talk);
    }
}

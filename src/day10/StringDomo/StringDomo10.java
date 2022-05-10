package day10.StringDomo;

public class StringDomo10 {
    public static void main(String[] args) {
        String str = "32128202001011234";
        String year = str.substring(6,10);
        String month = str.substring(10,12);
        String day = str.substring(12,14);
        char gender = str.charAt(16);
        int num = gender %-48;
        if (num  % 2 == 0){
            System.out.println("girl");

        } {
            System.out.println("boy");
        }

    }
}

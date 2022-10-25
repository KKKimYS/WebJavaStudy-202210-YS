package j07_반복;

public class Loop5 {
    public static void main(String[] args) {

        for (int dan = 2; dan < 10; dan++) {
            for (int i = 0; i < 9; i++) {
                int num = i + 1;
                System.out.println(dan + "X" + num + " = " + (dan * num));
            }
        }
    }
}

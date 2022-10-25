package j07_반복;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;

        System.out.print("반복 횟수: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++)
        {
            System.out.println("i의 결과값: " + (i + 1));
        }
    }
}

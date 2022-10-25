package j07_반복;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        int m = 0;

        System.out.print("n의 입력 횟수: ");
        n = scanner.nextInt();
        System.out.print("m의 입력 횟수: ");
        m = scanner.nextInt();

        for (int i = n; i > 0; i--)
        {
            System.out.println("i의 결과 값:" + i);
        }

        for (int p = 0; p < n; p++)
        {
            System.out.println("p의 결과 값:" + (n - p));
        }

    }
}

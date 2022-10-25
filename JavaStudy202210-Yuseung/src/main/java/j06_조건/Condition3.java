package j06_조건;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score = 0;


        String grade = null;
        System.out.print("점수를 입력하세요.");
        score = scanner.nextInt();

        if (score >= 90){
            grade = "A";
        } else if (score >= 80){
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.print("입력한 점수는 " + score);
        System.out.print("이며 " + grade);
        System.out.print(" 학점 입니다.");
    }
}

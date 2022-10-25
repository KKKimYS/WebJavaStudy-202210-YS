package j04_연산자;

public class Operation1 {
    public static void main(String[] args) {

        int num = 10;
        num = num+1;

        System.out.println(num);
        System.out.println(++num); //++num = 출력 전 계산 or num++ = 출력 후 계산
        System.out.println(num);
    }
}

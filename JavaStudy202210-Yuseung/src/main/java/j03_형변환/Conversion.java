package j03_형변환;

public class Conversion {
    public static void main(String[] args) {
        // upcasting(업캐스팅)
        // 묵시적 형변환 가능 (당연히 가능한거니까)
        // 정수형 변수 안에 문자가 들어갈 수 있음 = 문자 > 정수로 변환
        char cast1 = 'a';
        System.out.println((int) cast1);
        int cast2 = cast1;
        System.out.println(cast2);


        // downcastin(다운캐스팅)
        // 명시적 형변환 필요 (변환하겠다고 일부러 선언해줘야 함)
        int cast3 = 98;
//        char cast4 = cast3; //문자열 변수 안에 정수가 들어갈 수 없음!
        char cast4 = (char) cast3; // 정수를 문자형으로 변환 (아스키 코드 기준인듯)
        System.out.println(cast4);



        double cast5 = 3.14;
        System.out.println(cast5);

        int cast6 = (int) cast5;
        System.out.println(cast6);

        double  cast7 = cast6; // cast6 에서 int형 정수로 변환하면서 소수점 버리고 저장
        System.out.println(cast7); // 출력 시 3.0으로 출력됨

    }
}

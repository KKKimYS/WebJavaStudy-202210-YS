package j02_변수;

public class Variable {
    public static void main(String[] args) {


        // 논리자료형 변수
        boolean checkFlag = false;
        System.out.println(checkFlag);
        checkFlag = true;
        System.out.println(checkFlag);

        // 문자자료형 변수
        char name1 = '김';
        char name2 = '유';
        char name3 = '승';
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println("" + name1 + name2 + name3);

        // 문자열자료형 변수
        String name = "김유승";
        String name4 = "킹윾승";
        String name5 = name + name4;
        System.out.println(name5);

        //정수자료형 변수
        int width = 100;
        int width2 = 200;

        String width3 = "300";
        String width4 = "400";

        int widthResult = width + width2;
        String widthResult2 = width3 + width4;

        System.out.println(widthResult);
        System.out.println(widthResult2);

        long time = System.currentTimeMillis(); // 시간출력 포인터
        System.out.println(time);

        // int time2 = 1666178935899; //int = 21억까지 저장가능 / 초과로 에러 출력
        long time2 = 1666178935899l; //long 변수 사용 시 마지막 l 추가 필요

        // 실수자료형 변수
        double pi = 3000000.1415926535999999;
        System.out.println(pi);

        final String FILE_PATH = "C:Users:JavaStudy"; //final이 붙을 경우 변경 불가한 상수가 됨
//        FILE_PATH = "D:/Users/aaa";
        System.out.println(FILE_PATH);

    }
}

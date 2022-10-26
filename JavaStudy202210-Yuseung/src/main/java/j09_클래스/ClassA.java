package j09_클래스;

public class ClassA {

    int num;
    String name;
    double score;

    //생성자
    //생성자는 무조건 클래스랑 네임이 동일해야 함
    //반환 자료형이 없음(생략됨) - int, void 등 (항상 메모리 주소가 자동으로 반환됨)

    ClassA(){

    }
    ClassA(int a){
        System.out.println("a: " + a);
        System.out.println("ClassA를 생성합니다."); // ClaasA를 생성할때마다 해당 print 문구 출력
    }
    void callName() {
        System.out.println(name + "호출");
    }

}

package j09_클래스;

public class Constructor {

    int num;
    String name;

    Constructor(){
        System.out.println("NoArgsConstructor(기본 생성자)");
    }

    //자바에서는 전역 변수보다 지역 변수가 우선 순위가 높음 (동일 변수명)
    Constructor(int num){
        System.out.println("RequiredArgsConstructor(int 매게 변수를 필수로하는 생성자)"); //Required = 필수
        this.num = num; // this. = 메모리 주소 지정 키워드로 전역변수 강제 설정
    }

    Constructor(String name){
        System.out.println("RequiredArgsConstructor(String 매게 변수를 필수로하는 생성자)"); //Required = 필수
        this.name = name;
    }

    Constructor(int num, String name){
        System.out.println("AllArgsConstructor(전체 생성자)");
        this.num = num;
        this.name = name;
    }

    void showInfo(){
        System.out.println("num: " + num);
        System.out.println("name: " + name);
    }

}

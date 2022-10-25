package j08_메소드;

public class Overloading {

    //변수명은 다르지만 매게변수 형태가 다를 경우 사용 가능



    public static void add(){     // add()일 경우 1번 add 호출
        System.out.println("add()");
    }

    public static int add(int a){    // add(10)일 경우 2번 add 호출
        System.out.println("add(int a)");
    }

    public static void add(String s){   // add("문자")일 경우 3번 add 호출
        System.out.println("add(string s)");
    }

    public static int add(int a, int b){    // add(10, 20)일 경우 4번 add 호출
        System.out.println("add(int a)");

        return 0;
    }

    public static void main(String[] args) {

        add();
        add(10);
        add("10");
        add(10,20);


    }
}

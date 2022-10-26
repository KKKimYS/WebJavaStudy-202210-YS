package j09_클래스.Student풀이;

public class Student {

    String schoolName;
    int studentCode;
    int studentYear;
    String name;

    void increaseStudentYear(){
        if(studentYear < 5)
        {
            studentYear = studentYear + 1;
        }
        else
        {
            System.out.println(name + "의 학년을 더 이상 추가할 수 없습니다.");
        }

    }

    //강사님 방법
    /*
    void increaseStudentYear(){
    studentYear++;
    if(studentYear > 5)
    {
    System.out.println(학년을 더 이상 추가할 수 없습니다.");
      studentYear--;
      return;
      // 반복문에서 return 시 break 명령어와 동일하게 out됨
      // void 형태이기에 return 값 없음
      // showStudentInfo 명령 발생되지 않음
    }
    showStudentInfo()
    }
     */


    // 입력한 값 만큼 학년 증가
    // Overload 기능
    void increaseStudentYear(int year){
        studentYear += year;
        if(studentYear > 5)
        {
            System.out.println(year +"학년을 더하면 " + studentYear + "학년이 되어서 5학년을 넘어섭니다.");
            studentYear -= year;
            return;
        }
        showStudentInfo();
    }

    void showStudentInfo()
    {
        System.out.println("학교: " + schoolName);
        System.out.println("학번: " + studentCode);
        System.out.println("학년: " + studentYear);
        System.out.println("이름: " + name);
        System.out.println("");
    }
}

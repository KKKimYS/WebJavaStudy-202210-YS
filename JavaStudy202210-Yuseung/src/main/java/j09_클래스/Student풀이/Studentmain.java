package j09_클래스.Student풀이;

public class Studentmain {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "가상의학생1";
        s1.schoolName = "NC대학교";
        s1.studentCode = 20191009;
        s1.studentYear = 1;

        s2.name = "가상의학생2";
        s2.schoolName = "NCS대학교";
        s2.studentCode = 20221026;
        s2.studentYear = 3;

        s1.showStudentInfo();
        s2.showStudentInfo();

//        for(int i = 0; i < 10; i++) {
//            s1.increaseStudentYear(3);
//            s1.showStudentInfo();
//        }

        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);
        s1.increaseStudentYear(2);

    }
}

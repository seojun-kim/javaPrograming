package ch06;

public class StudentTest {

    public static void main(String[] args) {

        Student studentSeo = new Student();

        System.out.println(studentSeo.showStudentInfo());

        Student studentJun = new Student(01, "Jun", 2);

        System.out.println(studentJun.showStudentInfo());
    }
}

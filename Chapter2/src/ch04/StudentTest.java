package ch04;

public class StudentTest {

    public static void main(String[] args) {

        Student studentSeo = new Student();

        studentSeo.studentId = 0001;
        studentSeo.setStudentName("seo");
        studentSeo.address = "대구 광역시";

        studentSeo.showStudentInfo();

        Student studentJun = new Student();

        studentJun.studentId = 0002;
        studentJun.setStudentName("jun");
        studentJun.address = "유가읍";

        studentJun.showStudentInfo();
    }
}

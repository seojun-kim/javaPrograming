package ch09;

public class SubjectTest {

    public static void main(String[] args) {

        Student student1 = new Student(02, "seo");
        student1.setKoreaSubject("국어", 95);
        student1.setMathSubject("수학", 98);

        Student student2 = new Student(02, "jun");
        student2.setKoreaSubject("국어", 79);
        student2.setMathSubject("수학", 68);

        student1.showScoreInfo();
        student2.showScoreInfo();
    }
}

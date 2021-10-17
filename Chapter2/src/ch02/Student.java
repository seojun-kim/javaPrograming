package ch02;

public class Student {

    int studentNumber;
    String studentName;
    int majorCode;
    String majorName;
    int grade;

    public Student() {}

    public Student(int studentNumber, String studentName, int majorCode, String majorName, int grade) {

        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.majorCode = majorCode;
        this.majorName = majorName;
        this.grade = grade;
    }

    public void printStudent() {

        System.out.printf("studentNumber:%d \nstudentName:%s \nmajorCode:%d \nmajorName:%s \ngrade:%d \n", studentNumber, studentName, majorCode, majorName, grade);
    }
}

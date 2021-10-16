package ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    public Student() {}

    public Student(int studentNumber, String studentName, int grade) {

        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {

        return "학번:" + studentNumber + "\n이름:" + studentName + "\n학년:" + grade + "\n\n";
    }
}

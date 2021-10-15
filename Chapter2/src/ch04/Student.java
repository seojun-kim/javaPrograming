package ch04;

public class Student {

    int studentId;
    String studentName;
    String address;

    public void showStudentInfo() {
        System.out.printf("학번:%d \n이름:%s \n주소:%s\n\n", studentId, studentName, address);
    }

    public void setStudentName(String name) {

        studentName = name;
    }
}

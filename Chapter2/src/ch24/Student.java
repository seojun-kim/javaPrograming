package ch24;

import java.util.ArrayList;

public class Student {

    int studentID;
    String name;

    ArrayList<Subject> subjectList;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String subjectName, int Score) {
        Subject subject = new Subject();

        subject.setSubjectName(subjectName);
        subject.setScore(Score);

        subjectList.add(subject);
    }

    public void showScoreInfo() {
        int total = 0;

        for(Subject subject : subjectList) {
            total += subject.getScore();

            System.out.printf("%s학생의 %s과목 점수 %d\n", name, subject.getSubjectName(), subject.getScore());
        }
        System.out.printf("총점 %d\n\n", total);
    }
}

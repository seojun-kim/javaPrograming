package ch02;

public class EqualsTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student std1 = new Student(100, "Lee");
        Student std2 = new Student(100, "Lee");

        System.out.println(std1 == std2); //주소는 다르다
        System.out.println(std1.equals(std2)); //논리상 같다

        System.out.println(std1.hashCode());
        System.out.println(std2.hashCode());

        System.out.println(System.identityHashCode(std1)); //진짜 hashCode
        System.out.println(System.identityHashCode(std2)); //진짜 hashCode

        std1.setStudentName("Kim");
        Student copyStudent = (Student) std1.clone();
        System.out.println(copyStudent);


        /*String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1.equals(str2)); //true

        //같다
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        Integer I = 100;
        System.out.println(I.hashCode()); //100*/

    }
}

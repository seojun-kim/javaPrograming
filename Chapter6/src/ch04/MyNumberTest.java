package ch04;

public class MyNumberTest {

    public static void main(String[] args) {

        MyNumber myNumber = (num1, num2) -> num1 > num2 ? num1 : num2;

        System.out.println(myNumber.getMax(2, 4));
    }
}

package ch13;

import java.util.Scanner;

public class ConitionTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int max;

        System.out.println("두 정수 입력");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        System.out.println(max);
    }
}

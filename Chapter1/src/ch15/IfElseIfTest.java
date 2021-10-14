package ch15;

import java.util.Scanner;

public class IfElseIfTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int charge;

        if(age < 8) {
            charge = 1000;
            System.out.println("미치확아동");
        }
        else if(age < 14) {
            charge = 2000;
            System.out.println("초등학생");
        }
        else if(age < 20) {
            charge = 2500;
            System.out.println("중, 공등학생");
        }
        else {
            charge = 3000;
            System.out.println("어른");
        }

        System.out.printf("입장료는 %d", charge);
    }
}

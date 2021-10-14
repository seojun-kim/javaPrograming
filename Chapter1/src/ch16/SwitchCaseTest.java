package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day;

        /*switch (month) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 2: case 4: case 6: case 9: case 11:
                day = 30;
                break;
            default:
                day = -1;
        }*/

        day = switch (month) {
            case 2 -> 28;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> {
                System.out.println("존재하지 않는 달");
                yield -1;
            }
        };

        System.out.printf("%d월은 %d일", month, day);
    }
}

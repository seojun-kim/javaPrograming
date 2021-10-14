package ch19;

public class ForTest {

    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        for(count = 1; count <= 10; count++) {

            sum += count;
        }

        System.out.println(sum);
    }
}

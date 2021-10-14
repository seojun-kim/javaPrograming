package ch20;

public class NestedLoopTest {

    public static void main(String[] args) {

        for(int dan = 2; dan < 10; dan++) {

            for(int count = 1; count < 10; count++) {

                System.out.println(dan + "x" + count + "=" + dan * count);
            }
            System.out.println();
        }

        int dan = 2;
        int count = 1;

        while(dan < 10) {

            while(count < 10) {

                System.out.println(dan + "x" + count + "=" + dan * count);
                count++;
            }
            dan++;
            count = 1;

            System.out.println();
        }
    }
}

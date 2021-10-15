package ch03;

public class FuntionTest {

    public static int addNum(int num1, int num2) {

        int result;
        result = num1 + num2;
        return result;
    }

    public static void sayHello(String greeting) {

        System.out.println("Hello " + greeting);
    }

    public static int calcSum() {

        int sum = 0;

        for(int i = 1; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        int n1 = 10, n2 = 20;

        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("seojun");

        total = calcSum();
        System.out.println(total);
    }
}

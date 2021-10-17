package ch02;

public class OrderTest {

    public static void main(String[] args) {

        Order order1 = new Order();

        order1.setOrder(123, "seo", "jun", 146, "2021-10-17");
        order1.printOrder();
    }
}

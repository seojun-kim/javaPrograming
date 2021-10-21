package ch04;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerLee = new Customer("Lee");
        customerLee.bonusPoint = 1000;

        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer("Kim");
        customerKim.bonusPoint = 10000;

        System.out.println(customerKim.showCustomerInfo());
    }
}

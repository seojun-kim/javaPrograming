package ch04;

public class CustomerTest {

    public static void main(String[] args) {

        int price;

        Customer customerLee = new Customer("Lee");
        customerLee.bonusPoint = 1000;
        price = customerLee.calcPrice(1000);

        System.out.println(customerLee.showCustomerInfo() + " " + price);

        VIPCustomer customerKim = new VIPCustomer("Kim");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);

        System.out.println(customerKim.showCustomerInfo() + " " + price);
    }
}

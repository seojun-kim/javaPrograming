package ch06;

import java.util.ArrayList;
import java.util.concurrent.CompletionService;

public class CustomerTest {

    public static void main(String[] args) {

        int price = 10000;

        ArrayList<Customer> customerArrayList = new ArrayList<>();

        Customer customerT = new Customer("Tomas");
        Customer customerK = new Customer("Kim");
        Customer customerS = new GoldCustomer("Seo");
        Customer customerJ = new GoldCustomer("Jun");
        Customer customerC = new VIPCustomer("Cha");

        customerArrayList.add(customerT);
        customerArrayList.add(customerK);
        customerArrayList.add(customerS);
        customerArrayList.add(customerJ);
        customerArrayList.add(customerC);

        for(Customer customer : customerArrayList) {
            System.out.println(customer.showCustomerInfo());
        }

        for(Customer customer : customerArrayList) {
            int cost = customer.calcPrice(price);

            System.out.printf("%s님이 %d원 지불함\n", customer.getCustomerName(), cost);
            System.out.printf("%d포인트\n", customer.bonusPoint);
        }
    }
}

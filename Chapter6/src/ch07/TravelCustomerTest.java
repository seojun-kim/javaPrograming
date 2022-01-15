package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("고객 병단");
        customerList.stream().map(s -> s.getName()).forEach(s -> System.out.println(s));
        System.out.println();

        System.out.println("여행비용");
        System.out.println(customerList.stream().mapToInt(c -> c.getPrice()).sum());
        System.out.println();

        System.out.println("20살 이상");
        customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
    }
}

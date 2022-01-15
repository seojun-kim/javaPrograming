package ch05;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamTest {

    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        sList.stream().forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        sList.stream().map(n -> n.length()).forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        sList.stream().sorted().forEach(n -> System.out.print(n + "\t"));
        System.out.println();

        sList.stream().filter(n -> n.length() >= 5).forEach(s -> System.out.print(s + "\t"));
    }
}

package ch05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntArrayStreamTest {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        Arrays.stream(arr).forEach(n -> System.out.println(n));
    }
}

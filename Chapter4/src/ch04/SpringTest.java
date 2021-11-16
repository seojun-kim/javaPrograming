package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class SpringTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Class c = Class.forName("java.lang.String"); //java.lang.String 이 없으면 ClassNotFoundException 을 떨어진다.

        Constructor[] cons = c.getConstructors();
        for(Constructor con : cons) {
            System.out.println(con);
        }

        Method[] m = c.getMethods();
        for(Method method : m) {
            System.out.println(method);
        }

    }
}

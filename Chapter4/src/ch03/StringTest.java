package ch03;

public class StringTest {

    public static void main(String[] args) {

        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        java = java.concat(android);

        System.out.println(System.identityHashCode(java));
        //hashCode 가 다름
        //메모리가 계속 생김


    }
}

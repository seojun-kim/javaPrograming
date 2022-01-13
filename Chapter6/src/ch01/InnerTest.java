package ch01;

class OutTest {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutTest() {
        this.inClass = new InClass();
    }

    private class InClass {
        int iNum = 100;

        void inTest() {
            System.out.println("OutClass num = " + num);
            System.out.println("OutClass sNum = " + sNum);
            System.out.println("InClass inNum = " + iNum);
        }
    }

    public void usingClass() {
        inClass.inTest();
    }

    static class InStaticClass {
        int iNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println("InClass num = " + iNum);
            System.out.println("OutClass sNum = " + sNum);
            System.out.println("InClass sInNum = " + sInNum);
        }

        static void sTest() {
            System.out.println("OutClass sNum = " + sNum);
            System.out.println("InClass sInNum = " + sInNum);
        }
    }
}

public class InnerTest {

    public static void main(String[] args) {

        OutTest outTest = new OutTest();
        outTest.usingClass();
        System.out.println();

        OutTest.InStaticClass sInClass = new OutTest.InStaticClass();
        sInClass.inTest();

        System.out.println();

        OutTest.InStaticClass.sTest();
    }

}

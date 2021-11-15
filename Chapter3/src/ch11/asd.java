package ch11;

public class asd {

    class A {
        private int a;
        protected A(int i) { a = i; }
    }
    class B extends A {
        private int b;
        public B() {
            super(1);
            b = 0; }
    }
}

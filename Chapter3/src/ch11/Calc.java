package ch11;

public interface Calc {

    double PI = 3.14;
    int error = -999999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    void description();
}

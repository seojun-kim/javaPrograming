package ch11;

public class CompleteCalc extends Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 == 0) {
            return error;
        }
        else {
            return num1 / num2;
        }
    }

    @Override
    public void description() {

    }

    public void showInfo() {
        System.out.println("구현 완료");
    }
}

package ch06;

public class GoldCustomer extends Customer{

    double salesRatio;

    public GoldCustomer(String name) {
        super(name);

        salesRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;

        return price -= (int)(price * salesRatio);
    }
}

package ch06;

public class Customer {

    protected static int ID = 1000;
    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    /*public Customer() {

        customerID = getCustomerID();
        customerGrade = "SILVER";
        bonusRatio = 0.01;

        System.out.println("Customer() call");
    }*/

    public Customer(String customerName) {
        this.customerName = customerName;

        customerID = getCustomerID();
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public static int getID() {
        return ID++;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;

        return price;
    }

    public int getCustomerID() {
        return getID();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String showCustomerInfo() {
        return customerID + " " + customerName + "님의 등급 " + customerGrade + ", 보너스 포인트 " + bonusPoint;
    }
}

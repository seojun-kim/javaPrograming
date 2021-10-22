package ch04;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

    public VIPCustomer(String name) {
        super(name);

        //customerID = getCustomerID();
        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer() call");
    }

    @Override
    public int calcPrice(int price) {

        bonusPoint += price * bonusRatio;

        price -= (int)(price * salesRatio);
        return price;
    }

    public String getAgentID() {
        return agentID;
    }

}

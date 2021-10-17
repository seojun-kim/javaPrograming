package ch02;

public class Order {

    int orderId;
    String buyerId;
    String sellerId;
    int productId;
    String orderDate;

    public Order() {}
    public void setOrder(int orderId, String buyerId, String sellerId, int productId, String orderDate) {
        this.orderId = orderId;
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.productId = productId;
        this.orderDate = orderDate;
    }

    public void printOrder() {
        System.out.printf("order id:%d \nbuyer id:%s \nseller id:%s \nproduct id:%d \norder date:%s", orderId, buyerId, sellerId, productId, orderDate);
    }
}

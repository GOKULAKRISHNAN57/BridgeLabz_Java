package object_oriented_programming.Inheritance.DeliveredOrder_ShippedOrder;

class Order {
    int orderId;

    Order(int orderId) {
        this.orderId = orderId;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String trackingNumber) {
        super(orderId);
        this.trackingNumber = trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int id, String tracking, String date) {
        super(id, tracking);
        this.deliveryDate = date;
    }

    void getOrderStatus() {
        System.out.println("Delivered on: " + deliveryDate);
    }
}
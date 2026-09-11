package session_3_assignment.assigment_problems;

public class Order {
    static int totalOrders = 0;

    public Order() {
        totalOrders++;
    }

    public static void main(String[] args) {
        // Create four Order objects
        new Order();
        new Order();
        new Order();
        new Order();

        // Print Order.totalOrders exactly once, accessed through the class name
        System.out.println("Total orders: " + Order.totalOrders);
    }
}

package session_3_assignment.assigment_problems;

public class Product {
    String productId;
    String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public static void main(String[] args) {
        // Create one Product object through the constructor and print its two fields on one line
        Product product = new Product("P-1042", "Wireless Mouse");
        System.out.println(product.productId + " - " + product.productName);
    }
}

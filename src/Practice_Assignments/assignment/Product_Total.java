package assignment;

//Create a product with price and quantity. Calculate subtotal, 18% tax and final total.
public class Product_Total {
    public static void main(String[] args) {

        double price = 1000;
        int quantity = 2;

        double subtotal = price * quantity;

        double tax = subtotal * 18 / 100;

        double finalTotal = subtotal + tax;

        System.out.println("Product Price : " + price);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Subtotal      : " + subtotal);
        System.out.println("Tax (18%)     : " + tax);
        System.out.println("Final Total   : " + finalTotal);
    }
}




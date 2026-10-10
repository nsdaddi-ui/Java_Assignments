package assignment;

public class Eecommerce_Discount {
    public static void main(String[] args) {

        double cartAmount = 3000;
        String customerType = "VIP";

        double discount = 0;

        if (cartAmount >= 2000) {

            if (customerType=="VIP") {
                discount = cartAmount * 10 / 100;

            } else if (customerType== "STANDARD") {
                discount = cartAmount * 5 / 100;
            }
        }

        double finalAmount = cartAmount - discount;

        System.out.println("Cart Amount  : " + cartAmount);
        System.out.println("Customer     : " + customerType);
        System.out.println("Discount     : " + discount);
        System.out.println("Final Amount : " + finalAmount);
    }
}

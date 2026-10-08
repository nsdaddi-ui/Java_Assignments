package assignment;

public class Simple_Interest {
    public static void main(String[] args) {

        double principal = 50000;
        double rate = 8;
        double time = 2;

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Principal       : " + principal);
        System.out.println("Rate            : " + rate + "%");
        System.out.println("Time            : " + time + " years");
        System.out.println("Simple Interest : " + simpleInterest);
    }
}

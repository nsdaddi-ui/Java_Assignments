package assignment;

public class Banking_Withdrawal {
    public static void main(String[] args) {

        int balance = 50000;
        int withdrawalAmount = 10000;

        boolean accountActive = true;
        boolean pinValid = true;

        if (balance >= withdrawalAmount && withdrawalAmount > 0&& accountActive && pinValid) {

            balance = balance - withdrawalAmount;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);

        } else {

            System.out.println("Withdrawal Failed");
        }
    }
}

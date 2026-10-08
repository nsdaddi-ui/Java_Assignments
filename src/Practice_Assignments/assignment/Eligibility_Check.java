package assignment;

import java.util.Scanner;

public class Eligibility_Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the Age:");

        int age = sc.nextInt();
        System.out.print("Please enter the Income");

        double income = sc.nextInt();

        if (age >= 18 && income >= 25000) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }
    }
}

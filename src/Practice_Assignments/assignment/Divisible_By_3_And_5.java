package assignment;

import java.util.Scanner;

//Check whether a number is divisible by both 3 and 5 using logical operators.
public class Divisible_By_3_And_5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();

        if (num%3 == 0 && num%5 == 0){
            System.out.println("Number is devisible by 3 & 5");
        }
        else {
            System.out.println("Number is not divisible by 3 & 5");
        }
    }
}

package assignment;

public class Tricky_Assignments {
    public static void main (String[] args){
        //1. What is the output?
        int a=10, b=3;

        System.out.println("Value of a/b is=" + a/b);
        System.out.println("Value of a%b is=" + a%b);


        //2. find x, y and Z Value

        int x=5;
        int y= x++;
        int z= ++x;
        System.out.println("Value of Y is: " + y);
        System.out.println("Value of Z is: " + z);

        //3.what is value od d
        int d=10/4;
        System.out.println("Value of D is=" + d);

        //4. Fix float price = 99.99;
        float price = 99.99f;
        System.out.println("Price is fixed =" + price);

        //5. predict int a=10; System.out.println(a++ + ++a);
        System.out.println("Value of unary expression is =" + (a++ + ++a));

        // 6. Write a program using ?: to print PASS/FAIL.
        System.out.println(a>b?"PASS":"FAIL");
        System.out.println(z>x? "PASS" : "FAIL");

        // Salary Calculator
        int basic= 50000;
        int bonus= 5000;
        double tax= 0.10;
        double gross = basic+bonus;
        double net_salary = gross-tax;
        System.out.println("Gross Salary of employee is= "  +  gross);
        System.out.println("Tax of the salary is= " + gross*tax);
        System.out.println("Net salary of the Employee is= " + net_salary);




    }
}

package Tasks;

import java.util.Scanner;

public class Task7 {

     public static double Addition(double a, double b){
            return a+b;
        }

        public static double Subtraction(double a, double b){
            return a-b;
        }
        public static double Multiplication(double a, double b){
            return a*b;
        }
        public static double Division(double a, double b){
            return a/b;
        }
    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = userInput.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = userInput.nextDouble();

        System.out.println("Sum: " + Addition(num1, num2));
        System.out.println("Difference: " + Subtraction(num1, num2));
        System.out.println("Product: " + Multiplication(num1, num2));

        if (num2 != 0)
        System.out.println("Quotient: " + Division(num1, num2));
    else
        System.out.println("Quotient: Cannot divide by zero");
    }

    
}

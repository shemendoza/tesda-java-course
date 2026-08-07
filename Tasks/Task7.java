package Tasks;

import java.util.Scanner;

public class Task7 {

     public static double add(double a, double b){
            return a+b;
        }

        public static double subtract(double a, double b){
            return a-b;
        }
        public static double multiply(double a, double b){
            return a*b;
        }
        public static double divide(double a, double b){
            return a/b;
        }
    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = userInput.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = userInput.nextDouble();

        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));

        if (num2 != 0)
        System.out.println("Quotient: " + divide(num1, num2));
    else
        System.out.println("Quotient: Cannot divide by zero");
    }

    
}

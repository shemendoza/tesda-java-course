package ProgrammingChallenges;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = input.nextInt();

        if (num == 0)
            System.out.println("Zero");
        else{
        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        

        if(num >= 1)
            System.out.println("Positive");
        else
            System.out.println("Negative");
        }

       

    }
}

package ProgrammingChallenges;

import java.util.Scanner;

public class SumofAllIntegerInputs {
    public static void main(String[] args) {
        boolean isContinue = true;

        Scanner input = new Scanner(System.in);

        int sum = 0;

        do {
            System.out.println("Enter any number: ");
            int num = input.nextInt();
            sum += num;

            
            System.out.println("Would you like to continue? (Enter 'n' to stop, and 'y' to continue): ");
            char answer = input.next().charAt(0);

            if (answer == 'n' || answer == 'N')
                isContinue = false;
            else
                isContinue = true;

        }
        while(isContinue);
        
        System.out.println("Sum of all integer inputs: " + sum);

        input.close();
    }
}

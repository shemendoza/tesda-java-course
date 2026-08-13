package ProgrammingChallenges;

import java.util.Scanner;

public class LoopPattern{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= num - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++){
                
                System.out.print("*");
            }

            System.out.println();
        }
        

        input.close();

    }

}
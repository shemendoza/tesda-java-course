package Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 1st input number: ");
        int firstInput = userInput.nextInt();

        System.out.println("Enter 2nd input number: ");
        int secondInput = userInput.nextInt();

        System.out.println("Enter 3rd input number: ");
        int thirdInput = userInput.nextInt();

        if (firstInput == secondInput && secondInput == thirdInput)
            System.out.println("All numbers are equal");
        else{
            int largestNum = firstInput;

            if(secondInput > largestNum)
                largestNum = secondInput;

            if (thirdInput > largestNum)
                largestNum = thirdInput;

            System.out.println("Largest number is " + largestNum);

        }

        userInput.close();



    }
}

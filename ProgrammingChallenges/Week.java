package ProgrammingChallenges;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        String weekName;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter day of the week(1-7): ");
        int weekNum = input.nextInt();

        switch(weekNum){
        case 1:
            weekName = "Monday";
            System.out.println(weekName);
        break;
        case 2:
            weekName = "Tuesday";
            System.out.println(weekName);
        break;
        case 3:
            weekName = "Wednesday";
            System.out.println(weekName);
        break;
        case 4:
            weekName = "Thursday";
            System.out.println(weekName);
        break;
        case 5:
            weekName = "Friday";
            System.out.println(weekName);
        break;
        case 6:
            weekName = "Saturday";
            System.out.println(weekName);
        break;
        case 7:
            weekName = "Sunday";
            System.out.println(weekName);
        break;
        default:
            weekName = "Invalid input";
            System.out.println(weekName);
            break;
        }
        
    }
}

package ProgrammingChallenges;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        String monthName;
        int monthDays;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter a month number(1-12): ");
        int monthNum = userInput.nextInt();

        switch (monthNum) {
            case 1: 
            monthName = "January"; 
            monthDays = 30;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            case 2: 
            monthName = "February"; 
            monthDays = 28;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            case 3: 
            monthName = "March"; 
            monthDays = 31;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            case 4: 
            monthName = "April"; 
            monthDays = 30;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            case 5: 
            monthName = "May"; 
            monthDays = 31;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            case 6: 
            monthName = "June"; 
            monthDays = 30;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            case 7: 
            monthName = "July"; 
            monthDays = 31;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            case 8: 
            monthName = "August"; 
            monthDays = 31;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            case 9: 
            monthName = "September"; 
            monthDays = 30;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            case 10: 
            monthName = "October"; 
            monthDays = 31;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            case 11: 
            monthName = "November"; 
            monthDays = 30;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            case 12: 
            monthName = "December"; 
            monthDays = 31;
            System.out.println(monthName + " has " + monthDays + " days.");
            break;
            default:
                monthName = "Invalid month";
                System.out.println(monthName);
                break;
        }
    }
}

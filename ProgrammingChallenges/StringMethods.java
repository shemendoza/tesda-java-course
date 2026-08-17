package ProgrammingChallenges;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");
        String characters = input.nextLine();

        System.out.println("Length of the string: " + characters.length());
        System.out.println("String to uppercase: " + characters.toUpperCase());
        System.out.println("String to lowercase: " + characters.toLowerCase());
        System.out.println("First character of the string: " + characters.charAt(0));
        System.out.println("Last character of the string: "+ characters.charAt(characters.length()-1));

        if(characters.length()  == 1)
        {
            System.out.println("The string is too short");
        }
        else if(characters.length() < 5){
            System.out.println("Substring starting from the second character to the remaining character of the string: " + characters.substring(1, characters.length()));
        }
        else{
            System.out.println("Substring starting from the second character to the fifth character of the string: " + characters.substring(1, 5));
        }
        

    }
}

package ProgrammingChallenges;

import java.util.Scanner;
public class StringBuilderCharacters {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string of at least 10 characters: ");
        String characters = input.nextLine();

        if(characters.length() < 10){
            System.out.println("The string is too short");
        }
        else{
            StringBuilder sb = new StringBuilder(characters);
            System.out.println("Length of the string: " + sb.length());
            System.out.println("First character of the string: " + sb.charAt(0));
            System.out.println("Last character of the string: " + sb.charAt(characters.length() - 1));
            System.out.println("The index of the first occurrence of the letter 'a' in the string: " + sb.indexOf("a"));
            System.out.println("The substring of the string from index 3 to index 6: " + sb.substring(3,6));
            System.out.println("Append the string '123' to the end of the string: " + sb.append("123"));
            System.out.println("Inserted the string 'xyz' at index 4: " + sb.insert(4, "xyz"));
            System.out.println("Deleted the substring from index 2 to index 4: " + sb.delete(2, 4));
            System.out.println("Deleted the character at index 8: " + sb.deleteCharAt(8));
            System.out.println("Reversed the string: " + sb.reverse());
        }
        

       
    }

    
}

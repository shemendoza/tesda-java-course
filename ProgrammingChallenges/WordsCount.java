package ProgrammingChallenges;

import java.util.Scanner;
public class WordsCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine();

        int count = sentence.trim().split("\\s+").length;

        System.out.println("Number of words in an input : " + count);

    }

}

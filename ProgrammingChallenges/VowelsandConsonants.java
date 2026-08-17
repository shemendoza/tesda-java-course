package ProgrammingChallenges;

import java.util.Scanner;
public class VowelsandConsonants {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any word: ");
        String str = input.nextLine();
        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (isVowel(ch)) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelsCount + " and the vowel characters are: " + getVowelCharacters(str));
        System.out.println("Number of consonants: " + consonantsCount + " and the consonant characters are: " + getConsonantCharacters(str));
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    private static String getVowelCharacters(String str) {
        StringBuilder vowels = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && isVowel(ch)) {
                vowels.append(ch).append(" ");
            }
        }
        return vowels.toString().trim();
    }

    private static String getConsonantCharacters(String str) {
        StringBuilder consonants = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && !isVowel(ch)) {
                consonants.append(ch).append(" ");
            }
        }
        return consonants.toString().trim();
    }
}

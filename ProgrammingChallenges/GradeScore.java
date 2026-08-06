package ProgrammingChallenges;

import java.util.Scanner;
public class GradeScore{
    public static void main(String[] args){
        Scanner inputScore = new Scanner(System.in);

        System.out.println("Enter your score: ");
        int score = inputScore.nextInt();

        if(score >= 90)
            System.out.println("A grade");
        else if(score >= 80)
            System.out.println("B grade");
        else if(score >= 70)
            System.out.println("C grade");
        else if(score >= 60)
            System.out.println("D grade");
        else
            System.out.println("F grade");
        
    }
}
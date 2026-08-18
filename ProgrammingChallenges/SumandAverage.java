package ProgrammingChallenges;


public class SumandAverage {
    public static void main(String[] args) {
        int[] arrayNumbers = {3, 9, 2026, 17, 29};
        int sum = 0;
        for (int number : arrayNumbers) {
            sum += number;
        }
        double average = (double) sum / arrayNumbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

}

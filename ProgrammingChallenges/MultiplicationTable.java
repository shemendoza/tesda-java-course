package ProgrammingChallenges;
public class MultiplicationTable {
    int n;
    public static void main(String[] args) {
        Multiplication();
    }

    static void Multiplication(){

        for(int i = 1; i<= 10; i++){

            for (int j = 1; j <= 10; j++)
            {
                System.out.print(i*j +" ");
            }
            System.out.println();
        }
    }
}

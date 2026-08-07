package Tasks;

public class Task8 {
    public static void main(String[] args) {
        System.out.println("Total sum: " + sumOfSums(4,5,10));
    }

    public static int sumOfSums(int... numbers) {
        int cumulativeSums = 0;
        for (int number : numbers){
            int sum = 0;
            for(int i = 1; i <= number; i++){
                sum += i;
            }
            cumulativeSums += sum;

            System.out.println("Parameter " + number + ": sum = " + sum + ", cumulative sum = " + cumulativeSums);
        }
    
        
        return cumulativeSums;
    }
}

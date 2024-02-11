public class PrimeNumber {
    public static void main(String[] args) {
        // Iterate over numbers from 1 to 100
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true; // Assume the number is prime initially
        
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false; // If divisible, it's not prime
                    break; 
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

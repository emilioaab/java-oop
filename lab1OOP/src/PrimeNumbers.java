//Task 4: Write a progrma that prints prime numbers

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.print("prime numbers from 2 to 200: ");
        for (int i = 2; i <= 200; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}


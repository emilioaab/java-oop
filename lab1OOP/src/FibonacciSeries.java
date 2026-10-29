// Task 2: Write a program that does Fibonacci series.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter the number of Fibonacci terms
        System.out.print("Enter the number of Fibonacci terms: ");

        //Read the number of Fibonacci terms from the user
        int N = scanner.nextInt();

        //Initialize the first two terms of the Fibonacci series
        int a = 1, b = 1;

        //Print the first N Fibonacci numbers
        System.out.print("Fibonacci series: ");
        if (N >= 1) System.out.print(a);
        if (N >= 2) System.out.print(" " + b);

        for (int i = 3; i <= N; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }

        //Close the scanner to avoid resource leak
        scanner.close();


    }
}




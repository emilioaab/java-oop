//Task 3 : Write a program that reads a sequence of integers from the user and prints the even numbers and the sum of the odd numbers.
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class PrintEvenSumOdd {
    public static void main(String[] args){
        //Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter a sequence of integers
        System.out.print("Enter a number: ");

        //Read the number as a string from the user
        String number = scanner.next();

        //Create a map to count occurrences of each digit
        Map<Character, Integer> digitCount = new HashMap<>();

        //Count occurrences of each digit
        for (char digit :  number.toCharArray()) {
            digitCount.put(digit, digitCount.getOrDefault(digit, 0) + 1);
        }

        //Calculate the sum of digits appearing an even number of times
        int sum = 0;
        System.out.print("Digits that appear an even number of times: ");
        for (Map.Entry<Character, Integer> entry : digitCount.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                System.out.print(entry.getKey() + " ");
            }
            else {
                sum += Character.getNumericValue(entry.getKey());
            }

        }

        //Print the sum of digits
        System.out.println("\nSum of these digits: " + sum);

        //Close the scanner to avoid resource leak
        scanner.close();

    }
}

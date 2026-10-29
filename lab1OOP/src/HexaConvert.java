//Task 5: Write a program that converts a decimal number to hexadecimal.

import java.util.Scanner;

public class HexaConvert {
    public static void main(String[] args) {
        //Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");

        //Read the decimal number from the user
        int decimal = scanner.nextInt();

        //Convert the number to a hexadecimal string
        String hexString = Integer.toHexString(decimal).toUpperCase();

        //Pad the string with a leading zero if starts with a letter
        if (Character.isLetter(hexString.charAt(0))) {
            hexString = "0" + hexString;
        }

        //Print the hexadecimal representation of the decimal number
        System.out.println("Hexadecimal representation: " + hexString + "h");

        //Close the scanner to avoid resource leak
        scanner.close();

    }
}

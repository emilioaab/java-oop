import java.util.Scanner; //Import the Scanner class

//Task 1: Write a program that reads the radius of a circle and computes its area.
public class CircleArea {
    public static void main(String[] args) {
        // Declare variables for radius and area
        double radius, area;

        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter the radius
        System.out.print("Please enter the radius: ");

        //Read the radius from the user
        radius = scanner.nextDouble();

        //Calculate the area of the circle
        area = 2 * Math.PI * radius;

        //Print the area of the circle
        System.out.println("The area of the circle is: " + area);

        //Close the scanner to avoid resource leak
        scanner.close();

    }
}




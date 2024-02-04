import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");

        // Read the user's input as a double (assuming length can be a decimal value)
        double length = scanner.nextDouble();

        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");

        // Read the user's input as a double (assuming width can be a decimal value)
        double width = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = length * width;

        // Print the result to the console
        System.out.println("The area of the rectangle is: " + area);

        // Close the Scanner to avoid resource leak
        scanner.close();
    }
}

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");

        // Read the user's input as an integer
        int number = scanner.nextInt();

        // Use the ternary operator to print whether the number is even or odd
        System.out.println(number + " is " + (number % 2 == 0 ? "even" : "odd"));

        // Close the Scanner to avoid resource leak
        scanner.close();
    }
}

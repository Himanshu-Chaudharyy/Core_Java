import java.util.Scanner;

public class GettingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String UserInput = sc.nextLine();

        System.out.println("Welcome " + UserInput);
    }
}
/*
 * System.out.print("Enter an integer (e.g., 42): ");
 * int intValue = sc.nextInt();
 * 
 * System.out.print("Enter a double (e.g., 3.14): ");
 * double doubleValue = sc.nextDouble();
 * 
 * System.out.print("Enter a float (e.g., 3.14f): ");
 * float floatValue = sc.nextFloat();
 * 
 * System.out.print("Enter a char (e.g., 'A'): ");
 * char charValue = sc.next().charAt(0);
 * 
 * System.out.print("Enter a boolean (true/false): ");
 * boolean boolValue = sc.nextBoolean();
 * 
 * System.out.print("Enter a short (e.g., 1000): ");
 * short shortValue = sc.nextShort();
 * 
 * System.out.print("Enter a long (e.g., 1234567890L): ");
 * long longValue = sc.nextLong();
 * 
 * System.out.print("Enter a byte (e.g., 50): ");
 * byte byteValue = sc.nextByte();
 * 
 * System.out.println("Entered values - " +
 * "Integer: " + intValue + ", Double: " + doubleValue +
 * ", Float: " + floatValue + ", Char: " + charValue +
 * ", Boolean: " + boolValue + ", Short: " + shortValue +
 * ", Long: " + longValue + ", Byte: " + byteValue);
 * }
 * }
 * 
 */
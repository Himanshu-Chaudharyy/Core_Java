import java.util.Scanner;

public class CheckIntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter interger value to check :");
        System.out.println(sc.hasNextInt());// true if and only if this scanner's next token is a valid int value
        sc.close();
    }

}

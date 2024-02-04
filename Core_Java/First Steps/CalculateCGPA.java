import java.util.Scanner;

public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks for 3 subjects to calculate CGPA:");
        int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();

        // Assuming a scale of 10 for CGPA calculation
        double cgpa = ((subject1 + subject2 + subject3) / 30);
        System.out.println("Your CGPA out of 10 is: " + cgpa);
    }
}

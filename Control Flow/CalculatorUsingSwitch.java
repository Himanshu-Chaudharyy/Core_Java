import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select operator -, +, / , * ");

        char chr = sc.next().charAt(0);

        switch (chr) {
            case '-':
                System.out.println("Enter two numbers:");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println("Result: " + (num1 - num2));
                break;
            
            case'+':
            System.out.println("Enter two number to add:");
            int num3=sc.nextInt();
            int num4=sc.nextInt();
            System.out.println("Result: "+(num3+num4));

            break;
            
            case'*':
            System.out.println("Enter two number to Multiply ");
            float num5=sc.nextFloat();
            float num6=sc.nextFloat();
            System.out.println("Result: "+(num5*num6));

            break;

            case'/':
            System.out.println("Enter two number to divide :");
            float num7=sc.nextFloat();
            float num8=sc.nextFloat();
            System.out.println("Result :" +(num7/num8));

            // Add cases for other operators (+, %, *) similarly...

            default:
                System.out.println("Invalid operator");
        }
    }
}

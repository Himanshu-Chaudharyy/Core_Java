import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter range for example 1 to 100 :");
        int n =sc.nextInt();
        for (int i=2;i<=n;i+=2){
            sum+=i;
            System.out.println("The sum of even number is :"+sum);
        }
    }
}

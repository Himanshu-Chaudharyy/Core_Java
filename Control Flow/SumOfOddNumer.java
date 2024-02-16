import java.util.Scanner;
public class SumOfOddNumer{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sum of odd number range to fun sum :");
        int user=sc.nextInt();
        int sum=0;
        for(int i=1;i<=user;i+=2){
            sum+=i;
            System.out.println("Sum of odd number "+ user +" to :"+i+" is :"+sum);
        }
    }
}



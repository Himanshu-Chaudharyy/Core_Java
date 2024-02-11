import java.util.Scanner;
public class OddNumer {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sum of odd number range to print odd number :");
        int user=sc.nextInt();
        for(int i=1;i<=user;i+=2){
            System.out.println(i);
        }
    }
}

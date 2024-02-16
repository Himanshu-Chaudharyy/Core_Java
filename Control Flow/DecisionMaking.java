import java.util.Scanner;
public class DecisionMaking{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age to check you can vote or not :");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You can vote");
            }
        else{
            System.out.println("You can't vote");
        }
}
}

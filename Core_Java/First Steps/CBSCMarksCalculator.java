import java.util.Scanner;
public class CBSCMarksCalculator {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your five subject marks :");
        int Hindi=sc.nextInt();
        int English=sc.nextInt();
        int Mathematics=sc.nextInt();
        int Science=sc.nextInt();
        int SocialScience=sc.nextInt();
        float sum=Hindi+English+Mathematics+Science+SocialScience;
        float calculator=(sum/5);
        System.out.println(calculator);
    }
}

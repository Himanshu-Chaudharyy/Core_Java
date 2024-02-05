import java.util.Scanner;
public class incomeTax {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your income :");
        double income=sc.nextDouble();
        if (income<=250000) {
            System.out.println("Nil");
        }
        else if(income<=500000 ){
            double tax=(income/5);
            double finalIncome=income-tax;
            System.out.println("5% Income after tax:"+finalIncome);
        }
        else if(income<=500001 ){
            double tax=(income/20);
            double finalIncome=income-tax;
            System.out.println("20% Income after tax :"+finalIncome);
        }
        else if(income<=1000001 || income >=1000000){
            double tax=income/30;
            double finalIncome=income-tax;
            System.out.println("30% Income after tax :"+finalIncome);
        }
    }    
}

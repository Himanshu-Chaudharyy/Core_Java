public class StudentIsPassOrFail {
    public static void main(String[]args){
        int sub1=50;
        int sub2=50;
        int sub3=50;
        if(sub1 >= 33 && sub2 >= 33 && sub3 >= 33 ){
            System.out.println(((sub1+sub2+sub3)/3)+"%");
        }
        else
        System.out.println("Batter luck next time");
    }
}

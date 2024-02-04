public class StringMethod {
    public static void main(String[] args) {
        String name = "Himanshu";
        System.out.println(name.length());//8

        String lstring = name.toLowerCase();//himanshu
        System.out.println(lstring);//

        String ustring = name.toUpperCase();
        System.out.println(ustring);////HIMANSHU

        String nonTrimmedString = "     Himanshu     ";
        System.out.println(nonTrimmedString);//     Himanshu

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);//Himanshu
        
        System.out.println(name.substring(1));//imanshu
        System.out.println(name.substring(1, 5));//imans

        System.out.println(name.replace('s', 'h'));//himanhhu
        System.out.println(name.replace("s", "hima"));//himanhimhu

        System.out.println(name.startsWith("him"));//true
        System.out.println(name.endsWith("u"));//true

        System.out.println(name.charAt(4));//n

        String modifiedName = "Himanssshuuuu";
        System.out.println(modifiedName.indexOf("ssh"));//
        System.out.println(modifiedName.indexOf("sss", 4));
        System.out.println(modifiedName.lastIndexOf("uuuu", 7));

        System.out.println(name.equals("Himanshu"));
        System.out.println(name.equalsIgnoreCase("HimansHu"));

        System.out.println("I am escape sequence\tdouble quote");
    }
}

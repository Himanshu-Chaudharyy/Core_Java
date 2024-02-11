public class StarPatter1 {
    public static void main(String[] args) {
        String stars = "****";
        for (int i = 0; i < 5; i++) {
            System.out.println(stars.substring(i));//substrings of decreasing length as i increases.
        }

    }
}
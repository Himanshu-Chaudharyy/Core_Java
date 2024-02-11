public class EvenNumberSum1to100 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 2; i <= 100; i += 2) {
            sum+=i;
            System.out.println("Even number is :"+i);
            System.out.println("sum is: "+sum);
        }
    }
}

/*
 * 
Certainly! Let's go through the loop step by step for i from 2 to 10:

1.i = 2:
sum is initially 0.
sum += i; means sum = sum + i;, so sum becomes 0 + 2 = 2.
Output: "Even number is: 2" and "sum is: 2"

2.i = 4:
Now sum is 2 (from the previous iteration).
sum += i; means sum = sum + i;, so sum becomes 2 + 4 = 6.
Output: "Even number is: 4" and "sum is: 6"

3.i = 6:
Now sum is 6 (from the previous iteration).
sum += i; means sum = sum + i;, so sum becomes 6 + 6 = 12.
Output: "Even number is: 6" and "sum is: 12"

4.i = 8:
Now sum is 12 (from the previous iteration).
sum += i; means sum = sum + i;, so sum becomes 12 + 8 = 20.
Output: "Even number is: 8" and "sum is: 20"

5.i = 10:
Now sum is 20 (from the previous iteration).
sum += i; means sum = sum + i;, so sum becomes 20 + 10 = 30.
Output: "Even number is: 10" and "sum is: 30"
 */

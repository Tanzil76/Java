/* nested if -else statement */

import java.util.Scanner;

public class Conditionals3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Ternary operator
        String ans;
        ans = (num % 2 == 0) ? "even" : "odd";
        System.out.println(ans);

        
    }
}

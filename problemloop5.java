// print the first n factorial numbers

import java.util.Scanner;

public class problemloop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
            System.out.println("Fcatorila of " + i + ": " +fact);
        }
    }
}

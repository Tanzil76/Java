/* Count the number of digits for a given number n */
   // divide n by 10 until n>0 and count the number of divisions

import java.util.Scanner;

public class problemloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDigits = 0;
        int original_n = n;

        while(n > 0) {
            n = n/10;
            numOfDigits++; // numofDigits = numof Digits +1
        }
        
        System.out.println("Number of digits in " + original_n + " = " + numOfDigits);
        
    }
}

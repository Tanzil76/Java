/*Write a Java program that takes a positive integer n as input from the user and uses a for loop to calculate the sum of all
 numbers from 1 to n. If the user enters a negative number or zero, the program should print an error message and not calculate the sum. */
import java.util.Scanner;

public class forloopquestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please eneter a positive number:");
        int n = sc.nextInt();

        if (n <= 0){
            System.out.println("Please Enter a positive number greater than 0. ");
        } else {
            int sum = 0;
            for(int i = 1; i<= n; i++){
                sum += i;
            }
            System.out.println("sum of numbers from 1 to " + n + " is: " + sum);
        
        }
        sc.close();
    }
}

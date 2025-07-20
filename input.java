// Taking input
 // 1.Import the Scanner class
 // 2.Create a Scanner object
 // 3.Use methods like nextInt(), nextLine(), nextDouble(), etc., to take input

import java.util.Scanner;   // Step 1: import Scanner
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 2: create Scanner object
        
          // Step 3: take input
        System.out.println("Enter your name");
        String name = sc.nextLine();  // takes full line input by applying Line but next it shows only starting word it didn't read space
        System.out.println("Name is: " + name);
        System.out.println("Enter your lucky number");
        int num_1 = sc.nextInt();
        System.out.println("Lucky number is: " + num_1);
    }
}

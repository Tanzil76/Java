/* for loop - for loop ek control flow statement hai jo Java mein use hota hai jab tumhe ek code block ko fixed number of times ya ek 
    specific range mein repeat karna ho.
    for(init-statement;condition;final-expression){
    //code
    } */ 

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int num = 1; num <= n; num++){
            sum = sum + num;
        }
            System.out.println("Sum of numbers upto n");
        
    }
}

/* do-while loop - do-while loop ek control flow statement hai jo Java mein use hota hai jab tumhe ek code block ko kam se kam
   ek baar chalana ho, aur phir condition ke basis pe usse repeat karna ho. Yani, yeh loop pehle code execute karta hai, phir
   condition check karta hai. Agar condition true hai, toh loop dobara chalta hai.
 * do {
 * //code
 * }while(condition);
 * print the sum of the stream of integers in the input.
*/
import java.util.Scanner;

public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        
        do{
            sum += num;
            num = sc.nextInt();
        } while(num != -1);
      
        System.out.println(sum);
    }
}

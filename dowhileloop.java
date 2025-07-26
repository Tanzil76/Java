/* do-while loop
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

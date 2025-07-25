/*While loop
 * while(condition){
 * // code
 * }
 */
// print 1 to n
import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num++; // increment operator ++ , num = num+1
            
        }

    }
}
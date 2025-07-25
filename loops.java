/*While loop -while loop ek control flow statement hai jo Java mein use hota hai jab tumhe ek specific code block ko tab tak chalana
 hai jab tak ek condition true hai. Yani, jab tak condition true hai, loop chalta rahega, aur jaise hi condition false ho jati hai,
  loop ruk jata hai.
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
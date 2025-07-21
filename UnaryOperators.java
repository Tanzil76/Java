/* + , - , ++(increment) , --(decrement) , !(logical complement)
 * Post-increment operator = assign first then increment (e.g.- x++)
 * Pre-increment operator = increment first then assign (e.g.- ++x)
  */
public class UnaryOperators {
    public static void main(String[] args) {
        int p = 5 , q = 5;

        System.out.println(p++); // 5
        System.out.println(p); // 6

        System.out.println(++q); // 6
        System.out.println(q); // 6

        int x = p++; 
        int y = ++q;

        System.out.println(x); // 6
        System.out.println(y); // 7

        System.out.println(p); // 7
        System.out.println(q); // 7
    }
}

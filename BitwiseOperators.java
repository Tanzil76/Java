/* bitwise opeartors who operates on bit level basically 1 and 0
 * (|)bitwise OR - e.g. 9 - (1001)
 *                      10- (1010)
 *                        1011 - if  atleast one number will 1 then it will give 1 only
 * (&)bitwise AND - it returns 1 when both bit will be 1  
 * (^)bitwise exclusive OR - when both bit will same it give 0 and if both bit are different then it will give 1
 * (~)bitwise complement(NOT) - it convert all bits if 1 then 0 ,if then 1
 * (<<)left shift - it shift to left then number will change (a<<b=a*2^b)
 * (>>)right shift - it shift to right the number will drop digits who shifts then number will change (a>>b=a/2^b) */
public class BitwiseOperators {
    public static void main(String[] args) {
        int p = 9 , q = 10;
        System.out.println(p|q); // 11
        System.out.println(p&q); // 8
        System.out.println(p^q); // 3

        System.out.println(p<<1); // 18
        System.out.println(p<<2); // 36

        System.out.println(q>>1); // 5
        System.out.println(q>>2); // 2
    }
}

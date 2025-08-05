/* Java methods - block of code performing some action which runs only when it is called.
 *             e.g.- factorial();
 * why are methods importtant in java -write once, reuse many times.
 *                                     time save
 *                                     duplicate code reduces
 * types of methods -  user-defined , standard library. 
 *    How to declare methods :
 * 
 *      access modifier  return type   method name  ( parameter list ) {
 *          (public)        (int)        (sum)        (int a, int b)
 *              // code to be executed    
 *      }
 * 
 *   public class Main {
 *        public int sum(int a, int b) {
 *          // code to be executed  
 *        }
 *   }
 *    1. method signature -  method name + parameter list
 *                          e.g. sum(int a , int b)
 *    2. access specifier - public , private , protected , default 
 *    3. return type -  e.g. int
 *    4. method name - e.g. sum
 *    5. parameters - e.g. (int a , int b)
 *    6. method body - e.g. int ans = a + b ;
 *                            return ans ;
 *   Call a method : to call a method in java, you have to write the method's name followed by two parentheses () and a semicolon ; .
 *                   e.g. sum();
 *   Static keyword - non-access modifier ( single copy for whole class)
 */


// add two nummbers using methods 

import java.util.Scanner;

class Algebra{
    int add(int a, int b){
        int ans = a + b;
        return ans;
    }
}
public class method {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Sum of input numbers is");
        int ans = obj.add(x, y);
        System.out.println(ans);
    }
}
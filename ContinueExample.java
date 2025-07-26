/*continue ek Java keyword hai jo loops (for, while, do-while) ke andar use hota hai. Iska kaam hai current iteration ko skip
 karna aur loop ke agle iteration pe jana. Yani, jab continue statement execute hota hai, toh loop ka bacha hua code skip ho
  jata hai, aur loop dobara condition check karta hai. */
public class ContinueExample {
    public static void main(String[] args) {
        // print all the values between 1 and 50 except for the multiples of 3
        
        for(int num = 1; num <= 50; num++){
            if(num % 3 == 0){
                continue;
            }
            System.out.println(num);
        }
    }
}

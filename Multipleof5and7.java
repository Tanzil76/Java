/*break ek Java keyword hai jo loops (for, while, do-while) ya switch statements ke andar use hota hai. Iska kaam hai loop ya
 switch ko turant rokna aur uske baad ka code execute karna. Yani, jab break statement execute hota hai, toh loop ya switch se 
 bahar nikal jata hai. */
public class Multipleof5and7 {
    public static void main(String[] args) {
        int num = 1;
        
        while (true) {
            if((num % 5 == 0) && (num % 7 == 0)){
                System.out.println("Found ans " + num);
                break;
            }
            num++;
        }
    }
}
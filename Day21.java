package day21;

public class Day21 {

    public static void main(String[] args) {
     
        int a = 20;
        int b = 10;
        System.out.println("a ="+a);
         
        System.out.println("b = "+b);
 
        
        System.out.println("\nSebelum ditukar:\n a = "+a+"\n b = "+b);
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("\nSesudah ditukar:\n a = "+a+"\n b = "+b);
    }
    
}

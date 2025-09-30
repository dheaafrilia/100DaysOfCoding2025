package dhea.java;
import java.util.Scanner;
public class DheaJava {

    public static void main(String[] args) {
                
        Scanner dhea = new Scanner(System.in);   
                  System.out.print("Panjang = ");
        int P = dhea.nextInt();
        
        System.out.print("Lebar = ");
        int L = dhea.nextInt();
                
        int l = P * L;
        System.out.println("Panjang persegi "+P+"cm Lebar "+L+"cm dan luasnya adalah "+l+"cm");
   
        
        
            }

}

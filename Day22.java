package dhea.java;
import java.util.Scanner;
public class DheaJava {

    public static void main(String[] args) {
                
        Scanner dhea = new Scanner(System.in);   
             
        System.out.print("Masukkan sisi ");
        int S = dhea.nextInt();
    
        int L = S * S;
        System.out.println("Luas : " + L);
    }

}

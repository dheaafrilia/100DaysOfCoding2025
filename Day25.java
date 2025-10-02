package dhea.java;
import java.util.Scanner;
public class DheaJava {

    public static void main(String[] args) {

       Scanner dhea = new Scanner(System.in);
        
        System.out.print("Masukkan X = ");
        int x = dhea.nextInt();
        
        System.out.println("=== Increment (penambahan) ===");
        System.out.println("Nilai awal x = " + x);
        System.out.println("Pre-increment (++x) = " + (++x)); // tambah dulu, lalu tampil
        System.out.println("\nPost-increment (x++) = " + (x++)); // tampil dulu, lalu tambah
        System.out.println("Nilai akhir x = " + x);
        
        
        System.out.print("Masukkan Y = ");
        int y = dhea.nextInt();
        
        System.out.println("\n=== Decrement (pengurangan) ===");
        System.out.println("Nilai awal y = " + y);
        System.out.println("Pre-decrement (--y) = " + (--y)); // kurang dulu, lalu tampil
        System.out.println("\nPost-decrement (y--) = " + (y--)); // tampil dulu, lalu kurang
        System.out.println("Nilai akhir y = " + y);   
    }

}

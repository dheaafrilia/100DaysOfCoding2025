import java.util.Scanner;

public class day58 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
               
        System.out.print("Masukkan nilai n: ");
        int n = in.nextInt();
        
        System.out.print("Angka 1 sampai " + n + ": ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
            
        System.out.print("\nAngka " + (n-1) + " sampai 1: ");
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
            
        }
        
    }
    
}

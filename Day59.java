import java.util.Scanner;
public class day59 {
    public static void main(String[] args) {
//LATIHAN MENCETAK ANGKA GANJIL 1-N DAN ANGKA GENAP 1-N
           Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        System.out.print("Angka ganjil dari 1 sampai " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
            }
        }

        System.out.print("\nAngka genap dari 1 sampai " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
    


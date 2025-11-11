import java.util.Scanner;

public class day65 {
    public static void main(String[] args) {
        
        //LATIHAN : MEMBUAT BILANGAN FAKTORIAL
        
        Scanner in = new Scanner(System.in);

        System.out.println("===MENENTUKAN FAKTORIAL===");
        System.out.print("Masukkan angka : ");
        int n = in.nextInt();

        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println("faktorial " + n + " adalah : " + total);
    }

}
    
 


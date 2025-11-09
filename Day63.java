import java.util.Scanner;
public class day63 {
    public static void main(String[] args) {
//LATIHAN : MENGALIKAN 1-N
    
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int n = in.nextInt();

        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println("\nHasil perkalian 1-n adalah : " + total);
    }

}
    
  


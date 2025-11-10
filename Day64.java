import java.util.Scanner;

public class day64 {

    public static void main(String[] args) {

        //LATIHAN : MENCATAK HASIL M PANGKAT N
        
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan M : ");
        int m = in.nextInt();
        System.out.print("Masukkan N : ");
        int n = in.nextInt();

        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= m;
        }
        System.out.println(m + " pangkat " + n + " adalah : " + total);
    }

}

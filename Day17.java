import java.util.Scanner;
public class Day17Coding {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka1: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka2: ");
        int angka2 = input.nextInt();
        
        System.out.println("Sisa bagi:" + (angka1 % angka2));
                
    }
    
}

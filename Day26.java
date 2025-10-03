import java.util.Scanner;
public class Day26 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan nilai awal: ");
        int nilai = input.nextInt();       
        
        nilai += 4;
        System.out.println("nilai += 4: " + nilai);
        
        nilai -= 2;
        System.out.println("nilai -= 2: " + nilai);
        
        nilai *= 5;
        System.out.println("nilai *= 5: " + nilai);
        
        nilai /= 6;
        System.out.println("nilai /= 6: " + nilai);
        
        nilai %= 2;
        System.out.println("nilai %= 2: " + nilai);
    }
    
}

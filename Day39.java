package pkg100days.coding;

import java.util.Scanner;

public class Coding {          
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
 
          
        System.out.println("=== MENU WARUNG SOLATA  ===");
        System.out.println("1. BABI KECAP - Rp 35.000");
        System.out.println("2. BAKSO BABI - Rp 20.000");
        System.out.println("3. PANGSIT BABI - Rp 25.000");
        System.out.println("4. Keluar");
        System.out.println("---------------------");
        System.out.print("Pilih menu (1-4): ");

        int pilihan = in.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih BABI KECAP. Total bayar: Rp 35.000");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih BAKSO BABI. Total bayar: Rp 20.000");
        } else if (pilihan == 3) {
            System.out.println("Anda memilih PANGSIT BABI. Total bayar: Rp 25.000");
        } else if (pilihan == 4) {
            System.out.println("Terima kasih telah berkunjung!");
        } else {
            System.out.println("Pilihan tidak tersedia!");
        }

    }

}


    
    


    

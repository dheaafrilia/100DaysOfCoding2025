package day42.javaa;

import java.util.Scanner;

public class Day42Javaa {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Nama karyawan: ");
        String namaKariawan = input.nextLine();
        
        System.out.print("Gaji pokok: ");
        int gajiPokok = input.nextInt();
        System.out.print("Potongan pajak: ");
        int potonganPajak = input.nextInt();
        
        int a = gajiPokok - potonganPajak;
        System.out.println("=====================");
        System.out.println("Nama karyawan: " + namaKariawan);
        System.out.println("Gaji kotor: " + gajiPokok);
        System.out.println("Gaji bersih: " + a);
    }
    
}

package day46.java;

import java.util.Scanner;

public class Day46Java {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=======MENU WARUNG GW=======");
        System.out.println("1.AYAM BAKAR");
        System.out.println("2.NASI GORENG");
         System.out.println("3.MIE AYAM");
         System.out.print("MASUKKAN NO MENU YANG ANDA AKAN PESAN = ");
         int harga = in.nextInt();
         
         int Harga;
         switch(harga){
             case 1 -> {
                 harga = 20000;
                 System.out.println("harga pesanan anda Rp = " + harga);
             }
             case 2 -> {
             harga = 15000;
             System.out.println("harga pesanan anda Rp = " + harga);
             }
             case 3 -> {
             harga = 40000;
             System.out.println("harga pesanan anda Rp = " + harga);
             }
             default -> {
                 System.out.println("MENU YANG ANDA INGINKAN TIDAK ADA DIDALAM DAFTAR MENU!!!");
             }
         }

    }

}

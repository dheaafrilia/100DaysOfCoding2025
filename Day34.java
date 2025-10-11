package dhea.java;

import java.util.Scanner;

public class DheaJava {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan a : ");
        int a = in.nextInt();
        System.out.print("Masukkan b : ");
        int b = in.nextInt();

        // Operator aritmatika
        int c = a + b;
        int d = a * b;

        // Operator perbandingan
        boolean e = a > b;

        // Operator logika dan modulus (cek genap)
        boolean f = (a % 2 == 0 && b % 2 == 0);

        // Kombinasi operator logika
        boolean h = (a > 0 && a < 10 && b > 0 && b < 10);

        // operator penugasan
        a += 2;

        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Penjumlahan: " + c);
        System.out.println("perkalian: " + d);
        System.out.println("Apakah a lebih besar dari b : " + e);
        System.out.println("Apakah kedua angka genap: " + f);
        System.out.println("Apakah kedua angka tersebut satuan: " + h);
        System.out.println("Nilai a setelah di tambah 2 : " + a);

    }

}

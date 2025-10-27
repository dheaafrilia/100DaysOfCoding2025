package Day50;

import java.util.Scanner;

public class java {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int angka = input.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(hasil);
    }
}

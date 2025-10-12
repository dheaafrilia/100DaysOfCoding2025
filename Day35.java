package dhea.java;

import java.util.Scanner;

public class DheaJava {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int a = in.nextInt();

        if (a < 100) {
            System.out.println("angka bukan ratusan");
        } else {
            System.out.println("Angka termasuk  ratusan");
        }

    }

}

package day49;

import java.util.Scanner;

public class java {
    
    public static void main(String[] args) {
        
                Scanner in = new Scanner(System.in);

        System.out.print("masukkan umur : ");
        int umur = in.nextInt();

        String hasil = umur >= 18 ? "Dewasa" : "Anak-anak";

        System.out.println("umur anda : " + umur);
        System.out.println("Status : " + hasil);

    }

}

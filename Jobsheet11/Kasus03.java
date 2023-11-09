package Jobsheet11;

import java.util.Scanner;

public class Kasus03 {
    public static void main(String args[]){    
        Scanner input = new Scanner(System.in);
        System.out.print("Input tinggi piramida: ");
        int tinggi = input.nextInt();
        System.out.println();
        
        for(int i = 1; i <= tinggi; i++) {
            // Membuat spasi sebelum bintang
            for(int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for(int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            // Membuat baris baru
            System.out.println();
        }
    }
}

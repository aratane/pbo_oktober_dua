package com.example.pertemuan2_ihsan;

import java.util.Scanner;

public class Tugas_satu {
    public static void main(String[] args) {
        int bil;
        Scanner bill = new Scanner(System.in);

        System.out.println("Jenis Bilangan Detector : ");
        System.out.println("Masukan bilangan : ");
        bil = bill.nextInt();

        if (bil > 0) {
            if (bil % 2 == 0) {
                System.out.print("Bilangan " + bil + " adalah genap positif.\n");
            } else if (bil % 2 == 1) {
                System.out.println("Bilangan " + bil + " adalah ganjil positif. \n");
            }
        } else if (bil < 0) {
            if (bil % 2 == 0) {
                System.out.print("Bilangan " + bil + " adalah genap negatif.\n");
            } else if (bil % 2 == -1) {
                System.out.println("Bilangan " + bil + " adalah ganjil negatif. \n");
            }
        } else if (bil == 0) {
            System.out.println("Bilangan " + bil + " adalah NOL");
        }
    }
}

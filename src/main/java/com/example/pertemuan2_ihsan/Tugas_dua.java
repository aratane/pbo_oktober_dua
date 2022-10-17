package com.example.pertemuan2_ihsan;

import java.util.Objects;
import java.util.Scanner;

public class Tugas_dua {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.pilihMenu();
    }
}

class Menu {
    static int inputMenu;
    Scanner input = new Scanner(System.in);
    static String usnInput, pwInput, usn, pilih;
    int kesempatan = 0;

    void pilihMenu() {
        System.out.println("Menu Program: ");
        System.out.println("1. Login Program");
        System.out.println("2. Informasi Pembuat Program");
        System.out.println("3. Keluar Dari Program");
        System.out.println("Pilih Menu : ");
        inputMenu = input.nextInt();

        if (inputMenu == 1) {
            userLogin();
        } else if (inputMenu == 2) {
            System.out.println("Program ini dibuat oleh Ihsan Maulana dengan NIS : 2023322328");
            System.out.println("Ketik Y Untuk Kembali Ke Menu Utama atau ketik N untuk Logout : ");
            pilih = input.nextLine();
            pilih = input.nextLine();
            if (Objects.equals(pilih, "Y")) {
                pilihMenu();
            } else if (Objects.equals(pilih, "N")) {
                System.out.println("TERIMAKASIH TELAH MENGGUNAKAN PROGRAM INI");
            }
        } else if (inputMenu == 3) {
            System.out.println("TERIMAKASIH TELAH MENGGUNAKAN PROGRAM INI");
            System.exit(0);
        }
    }
    void userLogin() {
        System.out.println("Anda Memasuki Menu Login, Silakan isi data dibawah ini");
        System.out.println("Hi");
        for (int i = 3; i <= 3; i--) {
            kesempatan = i - 1;

            System.out.println("Masukan username : ");
            usn = input.nextLine();
            usnInput = input.nextLine();
            System.out.println("Masukan password : ");
            pwInput = input.nextLine();
            if (Objects.equals(usnInput, "Ihsan") && Objects.equals(pwInput, "ihsan123")) {
                System.out.println("LOGIN BERHASIL, SELAMAT DATANG " + usnInput);
                System.out.println("\n");
                System.out.println("Ketik Y Untuk Kembali Ke Menu Utama atau ketik N untuk Logout : ");
                pilih = input.nextLine();
                if (Objects.equals(pilih, "Y")) {
                    pilihMenu();
                } else if (Objects.equals(pilih, "N")) {
                    System.out.println("TERIMAKASIH TELAH MENGGUNAKAN PROGRAM INI");
                }
            } else if (kesempatan > 0) {
                System.out.println("Username atau Password salah, Anda Memiliki Kesempatan Login " + kesempatan + " Kali Lagi");
            }
            if (kesempatan == 0) {
                System.out.println("Username atau Password salah, Kesempatan Anda Habis, Program Selesai.");
                System.out.println("TERIMAKASIH TELAH MENGGUNAKAN PROGRAM INI");
                System.exit(0);
            }
        }
    }
}

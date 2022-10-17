package com.example.pertemuan2_ihsan;

import java.util.Scanner;

public class Tugas_tiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("##  Program Searching Angka ##");
        System.out.println("========================================");
        System.out.println();

        int[] arr = new int[100];
        int arr_count, i, num;

        System.out.print("Masukan Jumlah Data : ");
        arr_count = input.nextInt();

        for(i = 1; i <= arr_count; i++){
            System.out.print("Input data ke-" + i + " : ");
            arr[i] = input.nextInt();
        }

        System.out.println();

        System.out.print("Masukkan angka yang dicari : ");
        num = input.nextInt();

        for(i = 1; i < arr_count; i++){
            if(arr[i] == num){
                System.out.print("Ditemukan pada data ke-"+i);
                break;
            }
        }

        if(i == arr_count){
            System.out.print("Data yang dicari tidak ada.");
        }
    }
}

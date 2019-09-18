package com.dicoding.javafundamental.bangundatar;

import java.util.Scanner;

public class Main {

    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PersegiPanjang persegiPanjang;
        SegitigaSiku segitigaSiku;
        Lingkaran lingkaran;

        int s1, s2, r;

        persegiPanjang = new PersegiPanjang();
        segitigaSiku = new SegitigaSiku();
        lingkaran = new Lingkaran();

        mainMenu();

        switch (pilihan) {
            case '1': {
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + persegiPanjang.luas(s1, s2));
                System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling(s1, s2));
                break;
            }
            case '2': {
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + segitigaSiku.luas(s1, s2));
                System.out.println("Keliling segitiga: " + segitigaSiku.keliling(s1, s2));
                break;
            }
            case '3': {
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + lingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + lingkaran.keliling(r));
                break;
            }
            default: {
                System.out.println("Tidak ada pilihan");
                break;
            }
        }
    }

    private static void mainMenu() {
        // pilihan menu
        System.out.println("===================");
        System.out.println("Hitung luas dan keliling");
        System.out.println("1. Persegi panjang");
        System.out.println("2. Segitiga siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukkan menu: ");
        pilihan = scanner.next().charAt(0);
    }
}

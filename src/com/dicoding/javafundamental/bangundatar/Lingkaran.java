package com.dicoding.javafundamental.bangundatar;

public class Lingkaran implements BangunDatar {

    public Lingkaran() {
    }

    @Override
    public double luas(int s1, int s2) {
        return 0;
    }

    @Override
    public double keliling(int s1, int s2) {
        return 0;
    }

    public double luas(int r) {
        return Math.PI * Math.pow(r, 2);
    }

    public double keliling(int r) {
        return 2 * Math.PI * r;
    }
}

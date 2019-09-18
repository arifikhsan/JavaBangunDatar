package com.dicoding.javafundamental.bangundatar;

public class SegitigaSiku implements BangunDatar {

    SegitigaSiku() {

    }

    @Override
    public double luas(int s1, int s2) {
        return 0.5 * s1 * s2;
    }

    @Override
    public double keliling(int s1, int s2) {
        return s1 + s2 + Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
    }
}

package com.company;

import java.util.InputMismatchException;

public class Dodawanie {
    private int a;
    private int suma;

    public Dodawanie(int a){
        this.a = a;
        this.suma = 0;
    }

    public int dodawanieRekurencyjne(int a) throws InputMismatchException {

        suma += a;
        a -= 1;

        if (a > 0){
            dodawanieRekurencyjne(a);
        }

        return suma;
    }

    public int getA() {
        return a;
    }
}

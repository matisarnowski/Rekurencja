package com.company;

import java.util.InputMismatchException;

public class Fibonacci {
    private int n;
    private int start;

    public Fibonacci(int n){
        this.n = n;
        this.start = 1;
    }

    public int liczWyraz(int n) {
        if (n == 1)
            return start;
        if (n == 2)
            return start;
        if (n == 3)
            return start + start;
        else
            return liczWyraz(n - 2) + liczWyraz(n - 1);

    }

    public int getN() {
        return n;
    }
}

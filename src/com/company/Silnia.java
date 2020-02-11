package com.company;

import java.util.InputMismatchException;

public class Silnia {
    private int i;
    private int iloczyn;

    public Silnia(int i) {
        this.i = i;
        this.iloczyn = 1;
    }

    public int liczSilnie(int i) {

        iloczyn *= i;
        i -= 1;

        if (i > 1)
            return liczSilnie(i);

        return iloczyn;
    }

    public int getI() {
        return i;
    }
}

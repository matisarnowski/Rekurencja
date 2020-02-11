package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String a;
        String n;
        String i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą, przeprowadzimy dodawanie począwszy od tej liczby, aż do 1.");
        while (true) {

            try {
                a = sc.next();
                int aa = Integer.parseInt(a);
                Dodawanie dodaj = new Dodawanie(aa);
                System.out.printf("Wynik dodawania wszystkich liczb od: %d do 1, to: %d \n", dodaj.getA(), dodaj.dodawanieRekurencyjne(aa));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Błąd! Wpisano nie poprawne znaki. ");
                System.out.println("Spróbuj ponownie. ");
            }
        }

        System.out.println("Podaj liczbę całkowitą, wyprowadzimy odpowiedni wyraz ciągu Fibonnaciego dla tej liczby.");
        while (true) {

            try {
                n = sc.next();
                int nn = Integer.parseInt(n);
                Fibonacci fib = new Fibonacci(nn);
                System.out.printf("%d -ty wyraz ciągu Fibonacciego, to: %d \n", fib.getN(), fib.liczWyraz(nn));
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Błąd! Wpisano nie poprawne znaki. ");
                System.out.println("Spróbuj ponownie. ");
            }
        }

        System.out.println("Podaj liczbę całkowitą, policzymy z niej silnię.");
        while (true) {

            try {
                i = sc.next();
                int ii = Integer.parseInt(i);
                Silnia silnia = new Silnia(ii);
                System.out.printf("Silnia z: %d to: %d \n", silnia.getI(), silnia.liczSilnie(ii));
                break;
            } catch (NumberFormatException exc) {
                System.out.println("Błąd! Wpisano nie poprawne znaki. ");
                System.out.println("Spróbuj ponownie. ");
            }
        }
    }
}
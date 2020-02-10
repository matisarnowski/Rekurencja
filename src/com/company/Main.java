package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a;
        int n;
        int i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą, przeprowadzimy dodawanie począwszy od tej liczby, aż do 1.");
        while (true) {
            try {
                a = sc.nextInt();
                Dodawanie dodaj = new Dodawanie(a);
                System.out.printf("Wynik dodawania wszystkich liczb od: %d do 1, to: %d \n", dodaj.getA(), dodaj.dodawanieRekurencyjne(a));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Błąd! Wpisano nie poprawne znaki. ");
                break;
            }
        }

        System.out.println("Podaj liczbę całkowitą, wyprowadzimy odpowiedni wyraz ciągu Fibonnaciego dla tej liczby.");
        while (true) {
            try {
                n = sc.nextInt();
                Fibonacci fib = new Fibonacci(n);
                System.out.printf("%d -ty wyraz ciągu Fibonacciego, to: %d \n", fib.getN(), fib.liczWyraz(n));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Błąd! Wpisano nie poprawne znaki. ");
                break;
            }
        }

        System.out.println("Podaj liczbę całkowitą, policzymy z niej silnię.");
        while (true) {
            try {
                i = sc.nextInt();
                Silnia silnia = new Silnia(i);
                System.out.printf("Silnia z: %d to: %d \n", silnia.getI(), silnia.liczSilnie(i));
                break;
            } catch (InputMismatchException e) {
                System.out.println("Błąd! Wpisano nie poprawne znaki. ");
                break;
            }
        }
    }
}
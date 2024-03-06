package org.example;

public class InsertionSort {

    public static void sort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int x = v[i];
            int j = i - 1;

            while (j >= 0 && v[j] > x) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = x;
        }
    }

    public static void main(String[] args) {
        int[] v = {5, 2, 4, 6, 1, 3};
        System.out.println("Vetor desordenado:");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort(v);

        System.out.println("Vetor ordenado:");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

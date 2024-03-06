package org.example;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {3, 5, 78, 21, 11, 9};

        bubbleSort(vetor);

        System.out.println("Vetor desorganizado:");
        for (int element : vetor) {
            System.out.print(element + " ");
        }
    }
    public static void bubbleSort(int[] vetor){
        int aux;
        for (int i = 0; i < vetor.length-1; i++) {
            for (int j = 1; j < vetor.length-i; j++) {
                if (vetor[j - 1] > vetor[j] ){
                    aux = vetor[j-1];

                    vetor[j-1] = vetor[j];
                    vetor[j] =aux;
                }
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {17, 32, 64, 3, 5, 7, 94, 80, 9};
        int auxiliar = 0;

        for (int numero:vetor) {
            System.out.println("Sua lista desordenada: " + numero);
        }

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]){
                    auxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = auxiliar;
                }

            }
        }

        for (int numeroAtual:vetor) {
            System.out.println("Sua lista ordenada: " + numeroAtual);
        }

        ////////////////////////////////////////////////////////////////////

        int[] outroVetor = {3, 4, 64, 9, 657, 11, 256};

        for (int numero : outroVetor) {
            System.out.println("Sua lista desordenada 1: " + numero);
        }

        int menorIndice;
        boolean trocado;

        for (int i = 0; i < outroVetor.length - 1; i++) {
            menorIndice = i;
            trocado = false;

            for (int j = i + 1; j < outroVetor.length; j++) {
                if (outroVetor[j] < outroVetor[menorIndice]) {
                    menorIndice = j;
                    trocado = true;
                }
            }

            if (trocado) {
                int trocando = outroVetor[i];
                outroVetor[i] = outroVetor[menorIndice];
                outroVetor[menorIndice] = trocando;
            }
        }

        for (int numeroAtual : outroVetor) {
            System.out.println("Sua lista ordenada 2: " + numeroAtual);
        }

    ///////////////////////////////////////////////////////////////////


    }
}
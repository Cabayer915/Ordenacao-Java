package org.example;

public class PesquisaBinaria {
    public static void main(String[] args) {

        int[] vetor = {10,20,30,40,50,60,70,80,90};

        int result = PesquisaBinaria(vetor, 50);

        if (result != -1) {
            System.out.println("O numero está localizado no indice " + result);
        } else {
            System.out.println("Numero não está na lista");
        }
    }

    public static int PesquisaBinaria(int[]vetor, int x){

        int indinf = 0;
        int indsup = vetor.length - 1;

        while (indinf <= indsup) {
            int indmeio = indinf + (indsup - indinf) / 2;

            if (vetor[indmeio] == x) {
                return indmeio;
            } else if (vetor[indmeio] < x) {
                indinf = indmeio + 1;
            } else {
                indsup = indmeio - 1;
            }
        }
        return -1;
    }
}

package exercicios;

import java.util.Scanner;

public class b2decre {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // int[] vetor;
        int aux;
        /*Scanner in = new Scanner(System.in);
        System.out.print("Tamanho do Vetor b2 Decre");
        int t = in.nextInt();
        vetor = new int[t];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe um valor: ");
            vetor[i] = in.nextInt();
        }*/

        int vetor[] = {1, 9, 3, 8, 10};

        for (int i = 1; i < vetor.length; i++)
            for (int j = vetor.length-1; j >= i; j--) {
                if(vetor[j] > vetor[j - 1]){
                    aux = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = aux;
                }
            }

        for(int v : vetor)
            System.out.print(v+" ");
    }

}
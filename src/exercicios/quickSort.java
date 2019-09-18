package exercicios;

public class quickSort {
    public static void main(String args[]) {
        int arr[] = {8, 1, 2, 99, 45, 10, 8, 100};

        quickSort(arr, 0, arr.length - 1);

        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separa(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    public static int separa(int[] vetor, int inicio, int fim) {
        int pivo = vetor[(inicio + fim) / 2];
        int i = inicio - 1;
        int j = fim + 1;

        while (i < j) {
            do {
                j--;
            } while (vetor[j] > pivo);

            do {
                i++;
            } while (vetor[i] < pivo);

            if (i < j) {
                troca(vetor, i, j);
            }
        }

        return j;
    }

    public static void troca(int[] vetor, int inicio, int fim) {
        int aux = vetor[inicio];

        vetor[inicio] = vetor[fim];
        vetor[fim] = aux;
    }
}

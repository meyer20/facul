package exercicios;

public class selectionSort {

    public static void main(String[] args) {
        int vetor[] = {1, 9, 3, 8, 10};
        int position = 0;

        for (int i = 0; i < vetor.length - 1; i++) {
            position = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[position]) {
                    position = j;
                }
            }

            if (position != i) {
                int temp = vetor[position];
                vetor[position] = vetor[i];
                vetor[i] = temp;
            }
        }

        for(int v : vetor)
            System.out.print(v + " ");
    }

}
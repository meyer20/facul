package exercicios;

public class b2decre {

    public static void main(String[] args) {
        int aux;
        int vetor[] = {1, 9, 3, 8, 10};

        for (int i = 1; i < vetor.length; i++)
            for (int j = vetor.length - 1; j >= i; j--) {
                if (vetor[j] > vetor[j - 1]){
                    aux = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = aux;
                }
            }

        for (int v : vetor)
            System.out.print(v + " ");
    }

}
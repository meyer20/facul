package exercicios;

public class selectionSort {

    public static void main(String[] args) {
        int vetor[] = {1, 9, 3, 8, 10};
        int position = 0;

        System.out.println("Inicio do primeiro laço");
        System.out.println("Inicio loop");
        for (int i = 0; i < vetor.length - 1; i++) {
            System.out.println("Definição do valor ou posição do valor");
            position = i;

            System.out.println("Inicio do segundo laço");
            System.out.println("Inicio loop");
            for (int j = i + 1; j < vetor.length; j++) {
                System.out.println("Comparação dos valores");
                System.out.println("Comparação");
                if (vetor[j] < vetor[position]) {
                    position = j;
                    System.out.println("A posição do menor valor da comparação é atribuida");
                }
            System.out.println("Fim da iteração do segundo laço, parte para a próxima iteração para encontrar o menor valor");
            }

            if (position != i) {
                System.out.println("Troca dos valores utilizando como base a posição dos valores.");
                System.out.println("Troca");
                int temp = vetor[position];
                vetor[position] = vetor[i];
                vetor[i] = temp;
            }
            System.out.println("Fim da iteração do primeiro laço, parte para a próxima iteração");
            System.out.println("Fim loop");
        }

        for(int v : vetor)
            System.out.print(v + " ");
    }

}
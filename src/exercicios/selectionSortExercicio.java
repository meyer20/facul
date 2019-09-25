package exercicios;

import javax.swing.*;

public class selectionSortExercicio {

    public static void main(String[] args) {
        int position = 0;
        boolean isDescending = false;
        String input;
        input = JOptionPane.showInputDialog("Insira o tipo de ordenação. \nC para crescente e D para decrescente.");

        if (input.toUpperCase().equals("D")) {
            isDescending = true;
        }

        String[] numbers = JOptionPane.showInputDialog("Insira os números, separando eles por virgula: ").split(","); // 1
        int vetor[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            vetor[i] = Integer.parseInt(numbers[i]);
        }

        for (int i = 0; i < vetor.length - 1; i++) {
            position = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (isDescending) {
                    if (vetor[j] > vetor[position]) {
                        position = j;
                    }
                } else {
                    if (vetor[j] < vetor[position]) {
                        position = j;
                    }
                }
            }

            if (position != i) {
                int temp = vetor[position];
                vetor[position] = vetor[i];
                vetor[i] = temp;
            }
        }

        String result = "";

        for(int v : vetor) {
            result += v + "\n";
        }

        JOptionPane.showMessageDialog(null, result);
    }

}
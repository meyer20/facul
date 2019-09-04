package exercicios;

import javax.swing.*;

public class bubbleWhile {

    public static void main(String[] args) {
        boolean changed = true;
        String[] numbers = JOptionPane.showInputDialog("Insira os números, separando eles por virgula: ").split(","); // 1
        int vector[] = new int[numbers.length]; // 1
        for (int i = 0; i < numbers.length; i++) { //1 + n + 1 + n
            vector[i] = Integer.parseInt(numbers[i]); // 1
        }

        while (changed == true) {
            changed = false;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    int aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                    changed = true;
                }
            }
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
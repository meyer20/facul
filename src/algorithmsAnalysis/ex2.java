package algorithmsAnalysis;

import javax.swing.*;
import java.time.Duration;
import java.time.Instant;

public class ex2 {

    public static void main(String[] args) {
        Instant start = Instant.now(); // 1
        String[] numeros = JOptionPane.showInputDialog("Insira os números, separando eles por virgula: ").split(","); // 1
        int vector[] = new int[numeros.length]; // 1
        for (int i = 0; i < numeros.length; i++) { //1 + n + 1 + n
            vector[i] = Integer.parseInt(numeros[i]); // 1
        }

        double vectorA[] = new double[vector.length]; // 1
        double aux = 0; // 1

        for (int i = 0; i < vector.length; i++) { // 1 + n + 1 + n
            if (i == 0) { // n
                vectorA[0] = vector[i]; // 1
                aux = vectorA[0]; // 1
            } else if (i < vector.length) { // n
                aux = aux + vector[i]; // 1
                vectorA[i] = aux / (i + 1); // 1
            }
        }

        Instant finish = Instant.now(); // 1

        for (int x = 0; x < vectorA.length; x++) {
            System.out.println(vectorA[x]);
        }

        System.out.println("Tempo de execução:" + Duration.between(start, finish).toMillis() + "ms");
    }
}
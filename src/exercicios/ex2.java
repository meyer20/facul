package exercicios;

import javax.swing.*;

public class ex2 {
    public static void main (String[] args) {
        boolean run = true;
        String input = "";

        Integer numberOfPositions = Integer.parseInt(JOptionPane.showInputDialog("Insira o número máximo de posições do vetor"));

        Integer vector[] = new Integer[numberOfPositions];

        while (run) {
            input = JOptionPane.showInputDialog("1 - Inserir números\n" +
                    "2 - Ver números\n" +
                    "0 - Sair");

            if (input.equals("1")) {
                for (int i = 0; i < vector.length; i++) {
                    vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o número a ser inserido na posição " + (i + 1) + " do vetor"));

                }
            } else if (input.equals("2")) {
                String vectorValues = "";
                for (int i = 0; i < vector.length; i++) {
                    vectorValues += "Posição " + (i + 1) + " | Valor: " + vector[i] + "\n";
                }
                JOptionPane.showMessageDialog(null, vectorValues);
            } else {
                run = false;
            }
        }
    }
}

package exercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ex3 {

    public static void main(String[] args) {
        int vectorSize = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do Vetor"));
        String vector[] = new String[vectorSize];
        int sizeRounded = Math.round(vectorSize/2);
        if (vectorSize > 9) {
            String frase[] = JOptionPane.showInputDialog("Informe uma frase com: "+ sizeRounded +" Palavras").split(" ");
            String palavras[] = JOptionPane.showInputDialog("Agora informe "+ sizeRounded +" palavras aleatorias").split(" ");

            for (int i = 0; i < vector.length; i++) {
                if (i % 2 == 0) {
                    if (i == 0) {
                        vector[i] = frase[0];
                        frase[0] = null;
                    } else {
                        vector[i] = frase[sizeRounded - getArraySize(frase)];
                        frase[sizeRounded - getArraySize(frase)] = null;
                    }
                } else {
                    if (i == 1) {
                        vector[i] = palavras[0];
                        palavras[0] = null;
                    } else {
                        vector[i] = palavras[sizeRounded - getArraySize(palavras)];
                        palavras[sizeRounded - getArraySize(palavras)] = null;
                    }
                }
            }

            JOptionPane.showMessageDialog(null, Arrays.toString(vector));

        }
    }

    private static int getArraySize(String[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] != null) {
                counter++;
            }
        }

        return counter;
    }

}
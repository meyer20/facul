package algorithmsAnalysis;

import javax.swing.*;
import java.util.ArrayList;

public class ex1 {
    public static void main (String[] args) {
        String input = "";
        boolean run = true;

        ArrayList al = new ArrayList();
        String vertices[][] = new String[10][10];
        String arestas[] = new String[10];
        int counter = 0;

        while (run) {
            input = JOptionPane.showInputDialog("1 - Inserir vértice\n" +
                    "2 - Inserir distância\n" +
                    "3 - Consultar\n" +
                    "0 - Sair");

            if (input.equals("1")) {
                String vertice = JOptionPane.showInputDialog("Insira o nome do vértice");
                vertices[counter][counter] = vertice;
                counter++;
                for (int j = 0; j < vertices.length; j++) {
                    System.out.println(vertices[j]);
                }
            } else if (input.equals("2")) {
                String verticesSelecionados[] = JOptionPane.showInputDialog("Insira os vértices a adicionar distância. (A-B)").split("-");
                Integer distancia = Integer.parseInt(JOptionPane.showInputDialog("Insira a distância entre o vértice " + verticesSelecionados[0] + " para o vértice " + verticesSelecionados[1]));

                for (int i = 0; i < vertices.length; i++) {
                    if (vertices[i].equals(verticesSelecionados[1])) {
                        arestas[i] = distancia.toString();
                        break;
                    }
                }
            } else if (input.equals("3")) {
                for (int i = 0; i < vertices.length; i++) {
                    for (int j = 0; j < arestas.length; j++) {
                        System.out.println(vertices[i] + " - " + arestas[j]);
                    }
                }
            }
        }
    }
}

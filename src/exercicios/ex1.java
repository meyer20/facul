package exercicios;

import javax.swing.*;

public class ex1 {
    public static void main (String[] args) {
        String input = "";
        double saldo = 0;
        double valorSaque = 0;
        boolean run = true;

        while (run) {
            input = JOptionPane.showInputDialog("1 - Depósito\n" +
                    "2 - Sacar\n" +
                    "3 - Consultar\n" +
                    "0 - Sair");

            switch (input) {
                case "1":
                    saldo += Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a depositar"));
                    break;
                case "2":
                    valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor a sacar"));
                    if (saldo < valorSaque) {
                        JOptionPane.showMessageDialog(null, "Você não possui saldo suficiente para esta operação.");
                    } else {
                        saldo -= valorSaque;
                        JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!\nSeu saldo atual é de: " + saldo + "R$.");
                    }
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saldo atual:" + saldo + "R$.");
                    break;
                case "0":
                    run = false;
                    break;
                default:
                    break;

            }
        }
    }
}

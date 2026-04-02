package Main;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro numero"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("digite o segundo numero"));
        double resultado;
        String operacao = JOptionPane.showInputDialog("digite a operação" + "\n +, -, %, *");
        char operacaoCHAR = operacao.charAt(0);
        switch (operacaoCHAR) {
            case '+':
                resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "o resultado é " + resultado);
                break;
            case '-':
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "o resultado é " + resultado);
                break;
            case '%':
                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "o resultado é " + resultado);
                break;
            case '*':
                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "o resultado é " + resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "opção inválida");
        }

    }
}

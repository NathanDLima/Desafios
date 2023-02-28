import javax.swing.JOptionPane;

public class Teste02 {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número desejado: "));

        int numAnterior = 0;
        int numAtual = 1;
        int proxNumero = numAnterior + numAtual;

        while (proxNumero <= num) {
            if (proxNumero == num) {
                System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
                return;
            }
            numAnterior = numAtual;
            numAtual = proxNumero;
            proxNumero = numAnterior + numAtual;
        }

        System.out.println("O número "+ num + " não pertence à sequência de Fibonacci.");
    }
}


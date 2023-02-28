import javax.swing.JOptionPane;

public class Teste05 {

	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Digite a palavra que deseja inverter: ");
		
		String palavraInvertida = "";
		
		for(int i = palavra.length() - 1; i >= 0; i--) {
			palavraInvertida = palavraInvertida + palavra.charAt(i);
		}
		
		System.out.println(palavraInvertida);

	}

}

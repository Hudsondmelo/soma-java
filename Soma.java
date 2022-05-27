import javax.swing.JOptionPane;

public class Soma

{
	public static void main (String[] args)
	
	{
		String n1;//variavel responsável por receber o primeiro número através do JOptioPane
		String n2;//variavel responsável por receber o segundo número através do JOptioPane
		int num1;
		int num2;
		int soma;
		
		n1 = JOptionPane.showInputDialog("Digite nº1");
		n2 = JOptionPane.showInputDialog("Digite nº2");
		
		num1 = Integer.parseInt(n1);//converte o número recebido pela String em Inteiro
		num2 = Integer.parseInt(n2);
		soma = num1+num2;
		
		JOptionPane.showMessageDialog(null, "a soma dos dois número é: "+soma); 
		//aqui se exibe o resultado da operação em uma caixa de dialogo.
		
		System.exit(0);
	}
}
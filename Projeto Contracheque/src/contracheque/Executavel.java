package contracheque;

import javax.swing.JOptionPane;

public class Executavel {

	public static void main(String[] args) {
		
		BaseCalculo baseCalculo = new BaseCalculo();
		String salario = JOptionPane.showInputDialog("Digite o salario");
		String produtividade = JOptionPane.showInputDialog("Digite a produtividade");
				
		baseCalculo.setSalario(Double.parseDouble(salario));
		baseCalculo.setProdutividade(Double.parseDouble(produtividade));		
		
		System.out.println("O salario � " + baseCalculo.getSalario());
		System.out.println("A produtividade � " + baseCalculo.getProdutividade());
		System.out.println("O valor bruto � de " + baseCalculo.getValorBruto());
		System.out.println("O desconto � de " + baseCalculo.getDesconto());
		System.out.println("O Liquido � de " + baseCalculo.getLiquido());
			
	
	}

}

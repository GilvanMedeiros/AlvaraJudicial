package contracheque;

import javax.swing.JOptionPane;

public class Executavel {

	public static void main(String[] args) {
		
		BaseCalculo baseCalculo = new BaseCalculo();
		String salario = JOptionPane.showInputDialog("Digite o salario");
		String produtividade = JOptionPane.showInputDialog("Digite a produtividade");
		String admissao = JOptionPane.showInputDialog("Digite a datta de admissão");
				
		baseCalculo.setSalario(Double.parseDouble(salario));
		baseCalculo.setProdutividade(Double.parseDouble(produtividade));	
		baseCalculo.setDataAdmissão(admissao);
		
		//Imprimindo
		System.out.println("O salario é " + baseCalculo.getSalario());
		System.out.println("A data de admissão é " + baseCalculo.getDataAdmissão());
		System.out.println("A produtividade é " + baseCalculo.getProdutividade());
		System.out.println("O valor bruto é de " + baseCalculo.getValorBruto());
		System.out.println("O desconto é de " + baseCalculo.getDesconto());
		System.out.println("O Liquido é de " + baseCalculo.getLiquido());			
	
	}

}

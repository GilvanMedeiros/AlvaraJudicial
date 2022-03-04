package contracheque;

import javax.swing.JOptionPane;

public class Executavel {

	public static void main(String[] args) {
		
		BaseCalculo baseCalculo = new BaseCalculo();
		String salario = JOptionPane.showInputDialog("Digite o salario");
		String produtividade = JOptionPane.showInputDialog("Digite a produtividade");
		String admissao = JOptionPane.showInputDialog("Digite a datta de admiss�o");
				
		baseCalculo.setSalario(Double.parseDouble(salario));
		baseCalculo.setProdutividade(Double.parseDouble(produtividade));	
		baseCalculo.setDataAdmiss�o(admissao);
		
		//Imprimindo
		System.out.println("Data de Admiss�o: " + baseCalculo.getDataAdmiss�o());
		
		System.out.println("Sal�rio: R$ " + baseCalculo.getSalario());
		
		System.out.println("Produtividade: R$ " + baseCalculo.getProdutividade());
		
		System.out.println("Bruto: R$ " + baseCalculo.getValorBruto());
		
		System.out.println("30% INSS : " + baseCalculo.getPorcentagem());
		
		System.out.println("L�quido: " + baseCalculo.getLiquido());			
	
	}

}

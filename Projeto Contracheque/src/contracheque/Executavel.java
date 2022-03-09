package contracheque;

import javax.swing.JOptionPane;

public class Executavel {

	public static void main(String[] args) {
		
		BaseCalculo baseCalculo = new BaseCalculo();
		String salario = JOptionPane.showInputDialog("Digite o salario");
		String produtividade = JOptionPane.showInputDialog("Digite a produtividade");		
				
		baseCalculo.setSalario(Double.parseDouble(salario));
		baseCalculo.setProdutividade(Double.parseDouble(produtividade));		
		
		int confirmacao = JOptionPane.showConfirmDialog(null, "Os dados foram inseridos corretamente ?");		
		
		if (confirmacao == 0) {
			
			JOptionPane.showMessageDialog(null, "Salario -> R$ " + salario);
			JOptionPane.showMessageDialog(null, "Produtividade -> R$ " + produtividade);
			JOptionPane.showMessageDialog(null, "Valor Bruto -> R$ " + baseCalculo.getValorBruto());
			JOptionPane.showMessageDialog(null, "30% do INSS -> R$ " + baseCalculo.getPorcentagem());			
			
			double impostoDeRenda = (baseCalculo.getValorBruto() * 30) / 100;
			double liquido = baseCalculo.getLiquido() - impostoDeRenda;
			
			if (baseCalculo.getValorBruto() > 2500.00) {
				JOptionPane.showMessageDialog(null, "Valor Ultrapassou o teto que é de -> R$ 2500.00");
				JOptionPane.showMessageDialog(null, "Desconto de 40% do impostor de renda -> R$ " + impostoDeRenda);
				JOptionPane.showMessageDialog(null, "Valor Líquido com IRR -> R$ " + liquido);				
			} else {
				JOptionPane.showMessageDialog(null, "Valor Líquido -> R$ " + baseCalculo.getLiquido() + " Não ultrapassou o teto que é de R$ -> 2.500");
			}			
			
		}
		
		
		
		
		
		
		
	
	}

}

package sistemaAlvara;

import javax.swing.JOptionPane;

public class Executavel {

	public static void main(String[] args) {
		
		DadosPessoais dados = new DadosPessoais();
		
		String juiz = JOptionPane.showInputDialog("Nome do Juiz");
		String autor = JOptionPane.showInputDialog("Nome do Autor");
		String re = JOptionPane.showInputDialog("Nome da parte ré");
		String dataAlvara = JOptionPane.showInputDialog("Data do Alvara");
		String banco = JOptionPane.showInputDialog("Qual o Banco");
		String agencia = JOptionPane.showInputDialog("Qual a Agencia");
		String conta = JOptionPane.showInputDialog("Numero da Conta Bancaria");
		String advogado = JOptionPane.showInputDialog("Nome do Advogado");
		String cpfAutor = JOptionPane.showInputDialog("CPF do Autor");
		String Oab = JOptionPane.showInputDialog("OAB do Advogado");
		String deposito = JOptionPane.showInputDialog("Valor Deposito");
		
		
		//classe Dados Pessoais
		dados.setNomeJuiz(juiz);
		dados.setNomeAutor(autor);
		dados.setNomeRé(re);
		dados.setDataAlvara(dataAlvara);
		dados.setNomeBanco(banco);
		dados.setNomeAgencia(agencia);
		dados.setNumeroConta(conta);
		dados.setNomeAdvogadoAutor(advogado);
		dados.setCpfAutor(cpfAutor);
		dados.setOabAdvogado(Oab);
		
		
	}

}

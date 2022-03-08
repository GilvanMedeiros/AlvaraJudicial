package sistemaAlvara;

import java.util.Objects;

public class DadosPessoais {
	
	String nomeJuiz;
	String nomeAutor;
	String nomeRé;
	String dataAlvara;
	String nomeBanco;
	String nomeAgencia;
	String numeroConta;
	String nomeAdvogadoAutor;
	String cpfAutor;
	String OabAdvogado;
	
	
	//Geters Seters
	public String getNomeJuiz() {
		return nomeJuiz;
	}

	public void setNomeJuiz(String nomeJuiz) {
		this.nomeJuiz = nomeJuiz;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getNomeRé() {
		return nomeRé;
	}

	public void setNomeRé(String nomeRé) {
		this.nomeRé = nomeRé;
	}

	public String getDataAlvara() {
		return dataAlvara;
	}

	public void setDataAlvara(String dataAlvara) {
		this.dataAlvara = dataAlvara;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeAdvogadoAutor() {
		return nomeAdvogadoAutor;
	}

	public void setNomeAdvogadoAutor(String nomeAdvogadoAutor) {
		this.nomeAdvogadoAutor = nomeAdvogadoAutor;
	}

	public String getCpfAutor() {
		return cpfAutor;
	}

	public void setCpfAutor(String cpfAutor) {
		this.cpfAutor = cpfAutor;
	}

	public String getOabAdvogado() {
		return OabAdvogado;
	}

	public void setOabAdvogado(String oabAdvogado) {
		OabAdvogado = oabAdvogado;
	}
	
	/////////////////////////////////////////////////////////////////
	
	@Override
	public String toString() {
		return "DadosPessoais [nomeJuiz=" + nomeJuiz + ", nomeAutor=" + nomeAutor + ", nomeRé=" + nomeRé
				+ ", dataAlvara=" + dataAlvara + ", nomeBanco=" + nomeBanco + ", nomeAgencia=" + nomeAgencia
				+ ", numeroConta=" + numeroConta + ", nomeAdvogadoAutor=" + nomeAdvogadoAutor + ", cpfAutor=" + cpfAutor
				+ ", OabAdvogado=" + OabAdvogado + "]";
	}

	

	/////////////////////////////////////////////////////////////////////////////////////
	
	@Override
	public int hashCode() {
		return Objects.hash(OabAdvogado, cpfAutor, dataAlvara, nomeAdvogadoAutor, nomeAgencia, nomeAutor, nomeBanco,
				nomeJuiz, nomeRé, numeroConta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DadosPessoais other = (DadosPessoais) obj;
		return Objects.equals(OabAdvogado, other.OabAdvogado) && Objects.equals(cpfAutor, other.cpfAutor)
				&& Objects.equals(dataAlvara, other.dataAlvara)
				&& Objects.equals(nomeAdvogadoAutor, other.nomeAdvogadoAutor)
				&& Objects.equals(nomeAgencia, other.nomeAgencia) && Objects.equals(nomeAutor, other.nomeAutor)
				&& Objects.equals(nomeBanco, other.nomeBanco) && Objects.equals(nomeJuiz, other.nomeJuiz)
				&& Objects.equals(nomeRé, other.nomeRé) && Objects.equals(numeroConta, other.numeroConta);
	}
	
	
	/////////////////////////////////////////////////////////////////////
	
	
}

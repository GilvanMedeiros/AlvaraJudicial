package sistemaAlvara;

import java.util.Objects;

public class ValorDeposito {
	
	double valorDeposito;
	double valorImposto;
	double valorAutor;
	double valorAdvogado;
	
	//Geters e Seters
	public double getValorDeposito() {
		return valorDeposito;
	}
	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;
	}
	public double getValorImposto() {
		return valorImposto;
	}
	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}
	public double getValorAutor() {
		return valorAutor;
	}
	public void setValorAutor(double valorAutor) {
		this.valorAutor = valorAutor;
	}
	public double getValorAdvogado() {
		return valorAdvogado;
	}
	public void setValorAdvogado(double valorAdvogado) {
		this.valorAdvogado = valorAdvogado;
	}
	
	////////////////////////////////////////////////////////////
	
	//ToString
	@Override
	public String toString() {
		return "ValorDeposito [valorDeposito=" + valorDeposito + ", valorImposto=" + valorImposto + ", valorAutor="
				+ valorAutor + ", valorAdvogado=" + valorAdvogado + "]";
	}
	
	////////////////////////////////////////////////////////////////
	
	@Override
	public int hashCode() {
		return Objects.hash(valorAdvogado, valorAutor, valorDeposito, valorImposto);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValorDeposito other = (ValorDeposito) obj;
		return Double.doubleToLongBits(valorAdvogado) == Double.doubleToLongBits(other.valorAdvogado)
				&& Double.doubleToLongBits(valorAutor) == Double.doubleToLongBits(other.valorAutor)
				&& Double.doubleToLongBits(valorDeposito) == Double.doubleToLongBits(other.valorDeposito)
				&& Double.doubleToLongBits(valorImposto) == Double.doubleToLongBits(other.valorImposto);
	}
	
	
	
	
	

}

package br.com.folhaDePagamento;

public class FComissionado extends Funcionario{
	
	private double percentual;
	private double vendas;
	
	public FComissionado(double percentual, double vendas) {
		super();
		this.percentual = percentual;
		this.vendas = vendas;
	}
	public double getPercentual() {
		return percentual;
	}
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	public double getVendas() {
		return vendas;
	}
	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	
	public String calcularProventos() {
		return "A comissao de: " + ((getPercentual()/100)*getVendas());
	}
	
	
	
}

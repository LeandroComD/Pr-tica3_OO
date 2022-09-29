package br.com.folhaDePagamento;

public class FProdutividade {
	
	private double valor;
	private int producao;
	
	public FProdutividade(double valor, int producao) {
		super();
		this.valor = valor;
		this.producao = producao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getProducao() {
		return producao;
	}
	public void setProducao(int producao) {
		this.producao = producao;
	}
	
	public String calcularProventos() {
		return "Adicional de produtividade: " + (getValor()/getProducao());
	}
	
}

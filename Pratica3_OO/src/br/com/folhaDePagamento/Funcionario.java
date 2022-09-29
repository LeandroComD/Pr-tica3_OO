package br.com.folhaDePagamento;
import javax.swing.JOptionPane;

public class Funcionario {
	public static void main(String [] args) {
	int matricula;
	String nome;
	double salario;
	
	int opcao;
	
	do {
	
	nome = JOptionPane.showInputDialog("Nome do funcionario: ");
	matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula do funcionario: "));
	salario = Double.parseDouble(JOptionPane.showInputDialog("Salario do funcionario: "));
	
	opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Comissão\n<2> Produtividade\n<3> Padrão\n<4> Sair"));
	
	
	switch(opcao) {
	case 1:
		double percentual = Double.parseDouble(JOptionPane.showInputDialog("Percentual: "));
		double vendas = Double.parseDouble(JOptionPane.showInputDialog("Valor total de vendas: "));
		FComissionado comissao = new FComissionado(percentual, vendas);
		JOptionPane.showMessageDialog(null, comissao.calcularProventos(), "Mensagem", JOptionPane.DEFAULT_OPTION);
	break;
	case 2:
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da hora: "));
		int producao = Integer.parseInt(JOptionPane.showInputDialog("Quantidade produzida: "));
		FProdutividade produtividade = new FProdutividade(valor,producao);
		JOptionPane.showMessageDialog(null, produtividade.calcularProventos(), "Mensagem", JOptionPane.DEFAULT_OPTION);
	break;
	case 3:
		
	break;
	case 4:
		JOptionPane.showMessageDialog(null, "Até mais!");
	break;
	default:
		JOptionPane.showMessageDialog(null, "Opcao invalida!", "Mensagem", JOptionPane.ERROR_MESSAGE);
	}
	
	}while (opcao!=4);
	
	}

}

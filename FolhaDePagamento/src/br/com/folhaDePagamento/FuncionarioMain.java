package br.com.folhaDePagamento;
import javax.swing.JOptionPane;

public class FuncionarioMain {
    public static void main(String[] args) {
        int opcao;
        int matricula;
        int producao;
        double valor;
        double salario;
        double percentual;
        double vendas;
        String nome;


        do {

             nome = JOptionPane.showInputDialog("Nome do funcionario: ");
             matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula do funcionario: "));
             salario = Double.parseDouble(JOptionPane.showInputDialog("Salario do funcionario: "));

            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Comissão\n<2> Produtividade\n<3> Padrão\n<4> Sair"));


            switch (opcao) {
                case 1:
                    percentual = Double.parseDouble(JOptionPane.showInputDialog("Percentual: "));
                    vendas = Double.parseDouble(JOptionPane.showInputDialog("Valor total de vendas: "));
                    FComissionado comissao = new FComissionado(matricula, nome, salario,percentual,vendas);
                    JOptionPane.showMessageDialog(null, comissao.calcularProventos(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor da hora: "));
                    producao = Integer.parseInt(JOptionPane.showInputDialog("Quantidade produzida: "));
                    FProdutividade produtividade = new FProdutividade(matricula, nome, salario,valor,producao);
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

        } while (opcao != 4);

    }
}
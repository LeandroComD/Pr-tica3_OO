package br.com.carnaval;

import javax.swing.JOptionPane;

public class Carnaval {
    public static void main(String [] args){
        double valor;
        double valorAdicional;
        String localizacao;
        int opcao;
        //convertendo string para inteiro

       do {
           opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Ingresso Normal\n<2> Ingresso VIP\n<3> Ingresso Camarote\n<4> Sair"));


           switch (opcao) {
                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso: "));
                    Normal ingressoNormal = new Normal(valor);
                    JOptionPane.showMessageDialog(null, ingressoNormal.imprimeIngreso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso VIP: "));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso adicional Vip: "));
                    Vip ingressoVip = new Vip(valor, valorAdicional);
                    JOptionPane.showMessageDialog(null, ingressoVip.imprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso Camarote: "));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog("Valor do Ingresso adicional camarote: "));
                    localizacao = JOptionPane.showInputDialog("Localização: ");
                    Camarote ingressoCamarote = new Camarote(valor, localizacao, valorAdicional);
                    JOptionPane.showMessageDialog(null, ingressoCamarote.imprimeIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Até mais!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "O número escolhido é inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }while (opcao!=4);

    }


}
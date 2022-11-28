package br.com.newton.Questao1Revisao;
import javax.swing.JOptionPane;
public class JogadorSelecao {
        public static void main(String[]args) {
            String nomJogador = JOptionPane.showInputDialog(null, "Entre com seu jogador favorito: ");
            String selecao = JOptionPane.showInputDialog(null, "Entre com a seleção que ele joga");

            JOptionPane.showMessageDialog(null, "O jogador é o "+ nomJogador + " e joga no "+ selecao);


        }

}


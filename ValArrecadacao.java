package br.com.newton.Questao2Revisao;
import javax.swing.JOptionPane;
public class ValArrecadacao {
    public static void main(String[]args){
        double valIngresso = Double.parseDouble(JOptionPane.showInputDialog(null, "Entre com o valor do ingresso"));
        int qntPessoas = Integer.parseInt(JOptionPane.showInputDialog(null, "Entre com o público pagante"));

        double renda = valIngresso * qntPessoas;

        JOptionPane.showMessageDialog(null, "A renda do jogo foi de : "+ renda);
    }
}

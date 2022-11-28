package br.com.newton.Questao5;

import java.util.ArrayList;

public class Pedido {
    private  int codigo;
    Cozinha cozinha = new Cozinha();

    public Pedido(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public double calculaPedido(){
        double total=0;
        for(int i = 0 ; i<cozinha.listaPratos.size();i++ ){
            Prato p = (Prato) cozinha.listaPratos.get(i);
            total += p.getValor();
        }
        return total;


    }

}

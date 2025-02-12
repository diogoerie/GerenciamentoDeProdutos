package org.treinamento.sistemadegerenciamentoprodutos.model;

import org.treinamento.sistemadegerenciamentoprodutos.excecoes.PesoInvalidoExcecao;
import org.treinamento.sistemadegerenciamentoprodutos.excecoes.TipoInvalidoExcecao;
import org.treinamento.sistemadegerenciamentoprodutos.excecoes.ValidadeInvalidaExcecao;

public class Feijao extends Produtos{
    private int peso;
    private String tipo;


    public Feijao(){

    }

    @Override
    public double calcularPreco() throws PesoInvalidoExcecao, TipoInvalidoExcecao, ValidadeInvalidaExcecao {
        Double preco = getPreco();
        return 0;
    }
}

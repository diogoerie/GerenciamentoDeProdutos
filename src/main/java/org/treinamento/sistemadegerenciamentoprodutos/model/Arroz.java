package org.treinamento.sistemadegerenciamentoprodutos.model;

import org.treinamento.sistemadegerenciamentoprodutos.excecoes.PesoInvalidoExcecao;
import org.treinamento.sistemadegerenciamentoprodutos.excecoes.TipoInvalidoExcecao;
import org.treinamento.sistemadegerenciamentoprodutos.excecoes.ValidadeInvalidaExcecao;

public class Arroz extends Produtos{
    @Override
    public double calcularPreco() throws PesoInvalidoExcecao, TipoInvalidoExcecao, ValidadeInvalidaExcecao {
        return 0;
    }
}

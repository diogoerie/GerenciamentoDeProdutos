package org.treinamento.sistemadegerenciamentoprodutos.model;

import org.treinamento.sistemadegerenciamentoprodutos.excecoes.PesoInvalidoExcecao;
import org.treinamento.sistemadegerenciamentoprodutos.excecoes.TipoInvalidoExcecao;
import org.treinamento.sistemadegerenciamentoprodutos.excecoes.ValidadeInvalidaExcecao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class Arroz extends Produtos {
    private int peso;
    private LocalDate dataVencimento;
    private String tipo;
    private static final List<String> TIPOS_VALIDOS = Arrays.asList("integral", "parbolizado", "branco", "agulhinha");


    public Arroz() {
    }

    public Arroz(int peso, String tipo, String dataVencimento) {
        this.peso = peso;
        this.tipo = tipo.toLowerCase();
        this.dataVencimento = LocalDate.parse(dataVencimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public double calcularPreco() throws PesoInvalidoExcecao, TipoInvalidoExcecao, ValidadeInvalidaExcecao {
        LocalDate hoje = LocalDate.now();
        Double preco = getPreco();
        if (peso <= 0) {
            throw new PesoInvalidoExcecao("O peso do produto deve ser superior a 0 grama.");
        } else if (!TIPOS_VALIDOS.contains(tipo)) {
            throw new TipoInvalidoExcecao("O tipo de feijão só pode ser \"integral\", \"parbolizado\", \"branco\" ou \"agulhinha\". ");
        } else if (dataVencimento.isBefore(hoje)) {
            throw new ValidadeInvalidaExcecao("Data de válidade já expirada.");
        }
        return preco;
    }

}

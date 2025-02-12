package org.treinamento.sistemadegerenciamentoprodutos.model;


import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.treinamento.sistemadegerenciamentoprodutos.excecoes.PesoInvalidoExcecao;
import org.treinamento.sistemadegerenciamentoprodutos.excecoes.TipoInvalidoExcecao;
import org.treinamento.sistemadegerenciamentoprodutos.excecoes.ValidadeInvalidaExcecao;

//Exercício 5 - Sistema de Gerenciamento de Produtos com Spring Boot e JPA
//    Crie uma API REST em Spring Boot que gerencie um catálogo de produtos.
//        Um produto deve ter id, marca, preço e categoria.
//        Crie endpoints para adicionar, listar, buscar por id, atualizar e excluir produtos.
//    Configure o banco de dados usando Spring Data JPA e H2 (ou MySQL).
//    Utilize DTOs para separar entidades da camada de apresentação.
//    Implemente um endpoint de busca com filtro por categoria e faixa de preço.
//    Adicione tratamento de exceções para quando um produto não for encontrado.
//    Escreva testes unitários usando JUnit e Mockito para validar os serviços.
@Entity
@Table(name = "Tproduto")
public abstract class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String marca;
    @NotNull
    private Double preco;
    @NotNull
    private String categoria;

    public Produtos(){
    }
    public Produtos(String marca, Double preco, String categoria){
        this.marca = marca;
        this.preco = preco;
        this.categoria = categoria;
    }
    public abstract double calcularPreco() throws PesoInvalidoExcecao, TipoInvalidoExcecao, ValidadeInvalidaExcecao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

package org.treinamento.sistemadegerenciamentoprodutos.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

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
public class Produtos {

    @Id(strategy = )
    private int id;
    private String marca;
    private int peso;
    private Double preco;
    private String categoria;

    public Produtos(){
    }
    public Produtos(String marca, int peso, Double preco, String categoria){
        this.marca = marca;
        this.peso = peso;
        this.preco = preco;
        this.categoria = categoria;
    }


}

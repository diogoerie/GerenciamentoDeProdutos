package org.treinamento.sistemadegerenciamentoprodutos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.treinamento.sistemadegerenciamentoprodutos.model.Feijao;

@Repository
public interface FeijaoRepository extends CrudRepository<Feijao,Integer> {
}

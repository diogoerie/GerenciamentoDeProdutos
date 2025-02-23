package org.treinamento.sistemadegerenciamentoprodutos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.treinamento.sistemadegerenciamentoprodutos.model.Arroz;


@Repository
public interface ArrozRepository extends CrudRepository<Arroz,Integer> {

}

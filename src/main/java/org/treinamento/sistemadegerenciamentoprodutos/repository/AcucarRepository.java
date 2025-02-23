package org.treinamento.sistemadegerenciamentoprodutos.repository;

import org.springframework.data.repository.CrudRepository;
import org.treinamento.sistemadegerenciamentoprodutos.model.Acucar;
import java.util.List;

public interface AcucarRepository extends CrudRepository<Acucar,Integer> {
    List<Acucar> findByNome(String nome);

}

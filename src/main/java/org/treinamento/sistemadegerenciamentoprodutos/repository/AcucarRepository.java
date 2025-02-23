package org.treinamento.sistemadegerenciamentoprodutos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.treinamento.sistemadegerenciamentoprodutos.model.Acucar;
import java.util.List;

@Repository
public interface AcucarRepository extends CrudRepository<Acucar,Integer> {

}

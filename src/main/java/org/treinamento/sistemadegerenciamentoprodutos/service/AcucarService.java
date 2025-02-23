package org.treinamento.sistemadegerenciamentoprodutos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.treinamento.sistemadegerenciamentoprodutos.model.Acucar;
import org.treinamento.sistemadegerenciamentoprodutos.repository.AcucarRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AcucarService {

    @Autowired
    private AcucarRepository acucarRepository;

    public Acucar salvarEAtualuzar(Acucar acucar){
        return acucarRepository.save(acucar);
    }
    public Optional<Acucar> buscarPorId(Integer id){
        return acucarRepository.findById(id);
    }
    public List<Acucar> buscarPorNome(String Nome){
        return acucarRepository.findByNome(Nome);
    }
    public List<Acucar> listarTodos() {
        return (List<Acucar>) acucarRepository.findAll();
    }
    public void deletarPorId(Integer id){
        acucarRepository.deleteById(id);
    }
}

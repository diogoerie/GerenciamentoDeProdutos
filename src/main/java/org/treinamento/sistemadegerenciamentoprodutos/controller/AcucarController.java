package org.treinamento.sistemadegerenciamentoprodutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.treinamento.sistemadegerenciamentoprodutos.model.Acucar;
import org.treinamento.sistemadegerenciamentoprodutos.service.AcucarService;

@RestController
@RequestMapping("/acucar")
public class AcucarController {

    @Autowired
    private AcucarService acucarService;

    @GetMapping("/cadastro")
    public String telaCadastroAcucar(){
        return "cadastroAcucar";
    }
    @PostMapping("/novo")
    public ResponseEntity<Acucar> adcionarAcucar(Acucar acucar) {
        Acucar novoAcucar = acucarService.salvarEAtualuzar(acucar);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoAcucar);
    }

}

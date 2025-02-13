package org.treinamento.sistemadegerenciamentoprodutos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.treinamento.sistemadegerenciamentoprodutos.model.Acucar;
import org.treinamento.sistemadegerenciamentoprodutos.service.AcucarService;

@Controller
public class AcucarController {

    @Autowired
    private AcucarService acucarService;

    @GetMapping("/")
    public String adcionarAcucar(Acucar acucar){
        acucarService.adicionar(acucar);
        return "string";
    }


}

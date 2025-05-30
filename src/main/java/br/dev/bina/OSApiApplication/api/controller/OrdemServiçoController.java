/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.bina.OSApiApplication.api.controller;

import br.dev.bina.OSApiApplication.domain.model.OrdemServico;
import br.dev.bina.OSApiApplication.domain.service.OrdemServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesidevb
 */
public class OrdemServiçoController {
    
    @RestController
    @RequestMapping("/ordem-servico")
    public class OrdemServicoController {
        
        @Autowired
        private OrdemServicoService ordemServicoService;
        
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public OrdemServico criar(@RequestBody OrdemServico ordemServico) {
            return ordemServicoService.criar(ordemServico);
        }
    }
    
}

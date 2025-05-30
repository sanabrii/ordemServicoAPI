/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.bina.OSApiApplication.domain.repository;

import br.dev.bina.OSApiApplication.domain.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sesidevb
 */
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {
    
}

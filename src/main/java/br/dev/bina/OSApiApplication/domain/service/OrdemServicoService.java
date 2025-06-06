/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.bina.OSApiApplication.domain.service;

import br.dev.bina.OSApiApplication.domain.model.OrdemServico;
import br.dev.bina.OSApiApplication.domain.model.StatusOrdemServico;
import br.dev.bina.OSApiApplication.domain.repository.OrdemServicoRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesidevb
 */
@Service
public class OrdemServicoService {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    public OrdemServico criar(OrdemServico ordemServico) {
        ordemServico.setStatus(StatusOrdemServico.ABERTA);
        ordemServico.setDataAbertura(LocalDateTime.now());
        return ordemServicoRepository.save(ordemServico);
    }

    public Optional<OrdemServico> buscarPorId(Long id) {
        return ordemServicoRepository.findById(id);
    }

    public List<OrdemServico> listarTodas() {
        return ordemServicoRepository.findAll();
    }

    public Optional<OrdemServico> atualizar(Long id, OrdemServico novaOrdem) {
        return ordemServicoRepository.findById(id).map(ordem -> {
            ordem.setDescricao(novaOrdem.getDescricao());
            ordem.setPreco(novaOrdem.getPreco());
            ordem.setCliente(novaOrdem.getCliente());
            ordem.setStatus(novaOrdem.getStatus());
            ordem.setDataFinalizacao(novaOrdem.getDataFinalizacao());
            return ordemServicoRepository.save(ordem);
        });
    }

    public boolean excluir(Long id) {
        return ordemServicoRepository.findById(id).map(ordem -> {
            ordemServicoRepository.delete(ordem);
            return true;
        }).orElse(false);
    }
}

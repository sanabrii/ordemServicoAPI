/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.bina.OSApiApplication.api.exceptionhandler;

import br.dev.bina.OSApiApplication.api.exceptionhandler.ApiExceptionHandler.CampoProblema;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author sesidevb
 */
public class ProblemaException {
    private Integer status;
    private LocalDateTime dataHora;
    private String titulo;
    
    private List<CampoProblema> listaCamposProblema;
    
    public List<CampoProblema> getCampos() {
        return listaCamposProblema;
    }
    
    public void setCampos(List<CampoProblema> campos) {
        this.listaCamposProblema = campos; 
    }
    

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    static class CampoProblema {

        public CampoProblema(String nomeCampo, String mensagemCampo) {
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.odonto.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sanderson
 */
public class EstadoJsonConverter {

    private String sigla;
    private String nome;
    private List<String> cidades;

    public EstadoJsonConverter() {
        this.cidades = new ArrayList<>();
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getCidades() {
        return cidades;
    }

    public void setCidades(List<String> cidades) {
        this.cidades = cidades;
    }
    
    @Override
    public String toString() {
        return "Estado{" + "sigla=" + sigla + ", cidades=" + cidades + '}';
    }

}

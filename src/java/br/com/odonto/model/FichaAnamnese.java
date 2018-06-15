package br.com.odonto.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FichaAnamnese implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private boolean queixaDoencaAtual;
    private boolean algumaDoenca;
    private boolean seEmTratamento;
    private boolean gravidez;
    private boolean medicacao;
    private boolean operado;
    private boolean cicatrizacao;
    private boolean anestesia;
    private boolean hemorragia;
    private boolean febreReumatica;
    private boolean problemaCardiaco;
    private boolean diabetes;
    private boolean hipertensaoArterial;
    private String habitos;
    private String antecedentes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isQueixaDoencaAtual() {
        return queixaDoencaAtual;
    }

    public void setQueixaDoencaAtual(boolean queixaDoencaAtual) {
        this.queixaDoencaAtual = queixaDoencaAtual;
    }

    public boolean isAlgumaDoenca() {
        return algumaDoenca;
    }

    public void setAlgumaDoenca(boolean algumaDoenca) {
        this.algumaDoenca = algumaDoenca;
    }

    public boolean isSeEmTratamento() {
        return seEmTratamento;
    }

    public void setSeEmTratamento(boolean seEmTratamento) {
        this.seEmTratamento = seEmTratamento;
    }

    public boolean isGravidez() {
        return gravidez;
    }

    public void setGravidez(boolean gravidez) {
        this.gravidez = gravidez;
    }

    public boolean isMedicacao() {
        return medicacao;
    }

    public void setMedicacao(boolean medicacao) {
        this.medicacao = medicacao;
    }

    public boolean isOperado() {
        return operado;
    }

    public void setOperado(boolean operado) {
        this.operado = operado;
    }

    public boolean isCicatrizacao() {
        return cicatrizacao;
    }

    public void setCicatrizacao(boolean cicatrizacao) {
        this.cicatrizacao = cicatrizacao;
    }

    public boolean isAnestesia() {
        return anestesia;
    }

    public void setAnestesia(boolean anestesia) {
        this.anestesia = anestesia;
    }

    public boolean isHemorragia() {
        return hemorragia;
    }

    public void setHemorragia(boolean hemorragia) {
        this.hemorragia = hemorragia;
    }

    public boolean isFebreReumatica() {
        return febreReumatica;
    }

    public void setFebreReumatica(boolean febreReumatica) {
        this.febreReumatica = febreReumatica;
    }

    public boolean isProblemaCardiaco() {
        return problemaCardiaco;
    }

    public void setProblemaCardiaco(boolean problemaCardiaco) {
        this.problemaCardiaco = problemaCardiaco;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isHipertensaoArterial() {
        return hipertensaoArterial;
    }

    public void setHipertensaoArterial(boolean hipertensaoArterial) {
        this.hipertensaoArterial = hipertensaoArterial;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

}

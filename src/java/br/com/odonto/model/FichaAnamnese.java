package br.com.odonto.model;

import java.io.Serializable; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class FichaAnamnese implements Serializable {

    @Id
    @GeneratedValue
    
    private Long ID;   
    @Size(max = 255)
    private String queixaDoencaAtual ;
    private String algumaDoenca;
    private String seEmTratamento;
    private Boolean gravidez;
    @Size(max = 255)
    private String medicacao;
    private Boolean operado;
    private Boolean cicatrizacao;
    private Boolean anestesia;
    private Boolean hemorragia;
    private Boolean febreReumatica;
    @Size(max = 255)
    private String problemaCardiaco;
    private Boolean diabetes;
    private Boolean hipertensaoArterial;
    @Size(max = 255)
    private String habitos;
    private String antecedentes;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

 
    public String getQueixaDoencaAtual() {
        return queixaDoencaAtual;
    }

  
    public void setQueixaDoencaAtual(String queixaDoencaAtual) {
        this.queixaDoencaAtual = queixaDoencaAtual;
    }

  
    public String getAlgumaDoenca() {
        return algumaDoenca;
    }

   
    public void setAlgumaDoenca(String algumaDoenca) {
        this.algumaDoenca = algumaDoenca;
    }

    public String getSeEmTratamento() {
        return seEmTratamento;
    }

    public void setSeEmTratamento(String seEmTratamento) {
        this.seEmTratamento = seEmTratamento;
    }

  
    public Boolean getGravidez() {
        return gravidez;
    }

    public void setGravidez(Boolean gravidez) {
        this.gravidez = gravidez;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public Boolean getOperado() {
        return operado;
    }

  
    public void setOperado(Boolean operado) {
        this.operado = operado;
    }

 
    public Boolean getCicatrizacao() {
        return cicatrizacao;
    }

 
    public void setCicatrizacao(Boolean cicatrizacao) {
        this.cicatrizacao = cicatrizacao;
    }

  
    public Boolean getAnestesia() {
        return anestesia;
    }

    
    public void setAnestesia(Boolean anestesia) {
        this.anestesia = anestesia;
    }

  
    public Boolean getHemorragia() {
        return hemorragia;
    }

   
    public void setHemorragia(Boolean hemorragia) {
        this.hemorragia = hemorragia;
    }

    
    public Boolean getFebreReumatica() {
        return febreReumatica;
    }

    public void setFebreReumatica(Boolean febreReumatica) {
        this.febreReumatica = febreReumatica;
    }

    
    public String getProblemaCardiaco() {
        return problemaCardiaco;
    }

    
    public void setProblemaCardiaco(String problemaCardiaco) {
        this.problemaCardiaco = problemaCardiaco;
    }

  
    public Boolean getDiabetes() {
        return diabetes;
    }

   
    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

   
    public Boolean getHipertensaoArterial() {
        return hipertensaoArterial;
    }

   
    public void setHipertensaoArterial(Boolean hipertensaoArterial) {
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

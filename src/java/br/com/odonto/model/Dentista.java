package br.com.odonto.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Sanderson
 */
@Entity(name = "dentista")
@PrimaryKeyJoinColumn(name = "id_dentista")
public class Dentista extends Pessoa implements Serializable {

    private Long cro;
    private String especializacao;

    public Long getCro() {
        return cro;
    }

    public void setCro(Long cro) {
        this.cro = cro;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

}

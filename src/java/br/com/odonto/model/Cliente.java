package br.com.odonto.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "cliente")
@PrimaryKeyJoinColumn(name = "id_pessoa")
public class Cliente extends Pessoa implements Serializable {

    @OneToOne(fetch = FetchType.LAZY)
    private Pessoa responsavel;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private FichaAnamnese fichaAnamnese;

    public Cliente() {
        this.fichaAnamnese = new FichaAnamnese();
//        this.responsavel = new Pessoa();
    }

    public FichaAnamnese getFichaAnamnese() {
        return fichaAnamnese;
    }

    public void setFichaAnamnese(FichaAnamnese fichaAnamnese) {
        this.fichaAnamnese = fichaAnamnese;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

}

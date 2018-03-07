package br.com.odonto.model;

import br.com.odonto.enums.TipoPlano;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "cliente")
@PrimaryKeyJoinColumn(name = "id_pessoa")
public class Cliente extends Pessoa implements Serializable {

    @OneToOne(fetch = FetchType.LAZY)
    private Pessoa responsavel;
    @Enumerated(EnumType.STRING)
    private TipoPlano tipoPlano;
    private String planoConveniado;
//    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
//    fichaAnamnese: FichaAnamnese

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public TipoPlano getTipoPlano() {
        return tipoPlano;
    }

    public void setTipoPlano(TipoPlano tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public String getPlanoConveniado() {
        return planoConveniado;
    }

    public void setPlanoConveniado(String planoConveniado) {
        this.planoConveniado = planoConveniado;
    }

}

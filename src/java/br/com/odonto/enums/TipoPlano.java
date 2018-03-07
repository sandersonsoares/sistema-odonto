package br.com.odonto.enums;

/**
 *
 * @author Sanderson Soares
 */
public enum TipoPlano {
    NORMAL("Normal"),
    CONVENIO("Convênio");

    private String tipoPlano;

    private TipoPlano(String tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public String getTipoPlano() {
        return tipoPlano;
    }

    @Override
    public String toString() {
        return tipoPlano;
    }
}

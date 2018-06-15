package br.com.odonto.enums;

public enum Motivo {

    CIRURGIA("Cirurgia"),
    TRATAMENTO("Tratamento"),
    PROFILAXIA("Profilaxia");

    private String motivo;

    private Motivo(String motivo) {
        this.motivo = motivo;
    }

    public String getMotivo() {
        return motivo;
    }

    @Override
    public String toString() {
        return motivo;
    }

}

package br.com.odonto.enums;

public enum Situacao {

    CONFIRMAR("Confirmar"),
    CONFIRMADO("Confirmado"),
    DESMARCOU("Desmarcou"),
    FALTOU("Faltou"),
    CLIENTE_CHEGOU("Cliente Chegou"),
    EM_ATENDIMENTO("Em Atendimento"),
    ATENDIDO("Atendido");

    private String situacao;

    private Situacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSituacao() {
        return situacao;
    }

    @Override
    public String toString() {
        return situacao;
    }

}

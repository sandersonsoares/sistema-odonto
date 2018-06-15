package br.com.odonto.enums;

public enum TipoAgendamento {

    ORCAMENTO("Orçamento"),
    COMPROMISSO_PESSOAL("Compromisso Pessoal"),
    CONSULTA("Consulta"),
    PERIODICO("Periódico"),
    RETORNO("Retorno"),
    OUTRO("Outro");

    private String tipoAgendamento;

    private TipoAgendamento(String tipoAgendamento) {
        this.tipoAgendamento = tipoAgendamento;
    }

    public String getTipoAgendamento() {
        return tipoAgendamento;
    }

    @Override
    public String toString() {
        return tipoAgendamento;
    }
}

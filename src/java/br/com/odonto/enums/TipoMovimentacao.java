package br.com.odonto.enums;

/**
 *
 * @author Sandersoon
 */
public enum TipoMovimentacao {

    ENTRADA("Entrada"),
    SAIDA("Saída");

    private String tipoMovimentacao;

    private TipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String TipoMovimentacao() {
        return tipoMovimentacao;
    }

    @Override
    public String toString() {
        return tipoMovimentacao;
    }

}

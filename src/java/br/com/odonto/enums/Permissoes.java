package br.com.odonto.enums;

public enum Permissoes {

    //    SISTEMA
    ROLE_ACESSO_SISTEMA("Acesso ao Sistema"),
    //    CLIENTES
    ROLE_CADASTRAR_CLIENTES("Cadastro de Clientes"),
    ROLE_VISUALIZAR_CLIENTES("Visualização de Clientes"),
    ROLE_ALTERAR_CLIENTES("Alteração de Clientes"),
    ROLE_REMOVER_CLIENTES("Remoção de Clientes"),
    //    DENTISTAS
    ROLE_CADASTRAR_DENTISTAS("Cadastro de Dentistas"),
    ROLE_VISUALIZAR_DENTISTAS("Visualização de Dentistas"),
    ROLE_ALTERAR_DENTISTAS("Alteração de Dentistas"),
    ROLE_REMOVER_DENTISTAS("Remoção de Dentistas"),
    //    AGENDAMENTOS
    ROLE_CADASTRAR_AGENDAMENTOS("Cadastro de Agendamentos"),
    ROLE_VISUALIZAR_AGENDAMENTOS("Visualização de Agendamentos"),
    ROLE_ALTERAR_AGENDAMENTOS("Alteração de Agendamentos"),
    ROLE_REMOVER_AGENDAMENTOS("Remoção de Agendamentos"),
    //    FICHA_ANAMNESE
    ROLE_CADASTRAR_FICHA_ANAMNESE("Cadastro de Ficha Anamnese"),
    ROLE_VISUALIZAR_FICHA_ANAMNESE("Visualização de Ficha Anamnese"),
    ROLE_ALTERAR_FICHA_ANAMNESE("Alteração de Ficha Anamnese"),
    ROLE_REMOVER_FICHA_ANAMNESE("Remoção de Ficha Anamnese"),
    //    PROCEDIMENTOS
    ROLE_CADASTRAR_PROCEDIMENTOS("Cadastro de Procedimentos"),
    ROLE_VISUALIZAR_PROCEDIMENTOS("Visualização de Procedimentos"),
    ROLE_ALTERAR_PROCEDIMENTOS("Alteração de Procedimentos"),
    ROLE_REMOVER_PROCEDIMENTOS("Remoção de Procedimentos"),
    //    PAGAMENTOS
    ROLE_CADASTRAR_PAGAMENTOS("Cadastro de Pagamentos"),
    ROLE_VISUALIZAR_PAGAMENTOS("Visualização de Pagamentos"),
    ROLE_ALTERAR_PAGAMENTOS("Alteração de Pagamentos"),
    ROLE_REMOVER_PAGAMENTOS("Remoção de Pagamentos"),
    //    MOVIMENTACAO
    ROLE_CADASTRAR_MOVIMENTACAO("Cadastro de Movimentações"),
    ROLE_VISUALIZAR_MOVIMENTACAO("Visualização de Movimentações"),
    ROLE_ALTERAR_MOVIMENTACAO("Alteração de Movimentações"),
    ROLE_REMOVER_MOVIMENTACAO("Remoção de Movimentações"),
    //    CONVENIO
    ROLE_CADASTRAR_CONVENIOS("Cadastro de Convênios"),
    ROLE_VISUALIZAR_CONVENIOS("Visualização de Convênios"),
    ROLE_ALTERAR_CONVENIOS("Alteração de Convênios"),
    ROLE_REMOVER_CONVENIOS("Remoção de Convênios"),
    //    USUARIOS
    ROLE_CADASTRAR_USUARIOS("Cadastro de Usuários do Sistema"),
    ROLE_VISUALIZAR_USUARIOS("Visualização de Usuários do Sistema"),
    ROLE_ALTERAR_USUARIOS("Alteração de Usuários do Sistema"),
    ROLE_REMOVER_USUARIOS("Remoção de Usuários do Sistema"),
    //    GRUPOS
    ROLE_CADASTRAR_GRUPOS("Cadastro de Grupos de Usuários"),
    ROLE_VISUALIZAR_GRUPOS("Visualização de Grupos de Usuários"),
    ROLE_ALTERAR_GRUPOS("Alteração de Grupos de Usuários"),
    ROLE_REMOVER_GRUPOS("Remoção de Grupos de Usuários");

    private String permissao;

    private Permissoes(String permissao) {
        this.permissao = permissao;
    }

    public String getPermissao() {
        return permissao;
    }

}

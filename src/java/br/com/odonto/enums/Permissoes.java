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

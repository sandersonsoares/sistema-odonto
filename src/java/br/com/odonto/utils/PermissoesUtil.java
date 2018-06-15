package br.com.odonto.utils;

import br.com.odonto.enums.Permissoes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sanderson
 *
 * Permissões
 */
public class PermissoesUtil {

    /*
    Clientes
     */
    private boolean cadastroClientes;
    private boolean visualizarClientes;
    private boolean alterarClientes;
    private boolean removerClientes;
    /*
    Dentistas
     */
    private boolean cadastroDentistas;
    private boolean visualizarDentistas;
    private boolean alterarDentistas;
    private boolean removerDentistas;
    /*
    Agendamentos
     */
    private boolean cadastroAgendamentos;
    private boolean visualizarAgendamentos;
    private boolean alterarAgendamentos;
    private boolean removerAgendamentos;
    /*
    Ficha Anamnese
     */
    private boolean cadastroFichaAnamnese;
    private boolean visualizarFichaAnamnese;
    private boolean alterarFichaAnamnese;
    private boolean removerFichaAnamnese;
    /*
    Procedimentos
     */
    private boolean cadastroProcedimentos;
    private boolean visualizarProcedimentos;
    private boolean alterarProcedimentos;
    private boolean removerProcedimentos;
    /*
    Pagamentos
     */
    private boolean cadastroPagamentos;
    private boolean visualizarPagamentos;
    private boolean alterarPagamentos;
    private boolean removerPagamentos;
    /*
    Movimentacoes
     */
    private boolean cadastroMovimentacoes;
    private boolean visualizarMovimentacoes;
    private boolean alterarMovimentacoes;
    private boolean removerMovimentacoes;
    /*
    Convenios
     */
    private boolean cadastroConvenios;
    private boolean visualizarConvenios;
    private boolean alterarConvenios;
    private boolean removerConvenios;
    /*
    Usuários
     */
    private boolean cadastroUsuarios;
    private boolean visualizarUsuarios;
    private boolean alterarUsuarios;
    private boolean removerUsuarios;
    /*
    Grupos
     */
    private boolean cadastroGrupos;
    private boolean visualizarGrupos;
    private boolean alterarGrupos;
    private boolean removerGrupos;

    private List<Permissoes> permissoes;

    /**
     * Recupera as flags do formulário
     *
     * @return Lista de Permissões
     */
    public List<Permissoes> toForm() {
        this.permissoes = new ArrayList<>();

        /*
          Clientes
         */
        if (cadastroClientes) {
            permissoes.add(Permissoes.ROLE_CADASTRAR_CLIENTES);
        }
        if (visualizarClientes) {
            permissoes.add(Permissoes.ROLE_VISUALIZAR_CLIENTES);
        }
        if (alterarClientes) {
            permissoes.add(Permissoes.ROLE_ALTERAR_CLIENTES);
        }
        if (removerClientes) {
            permissoes.add(Permissoes.ROLE_REMOVER_CLIENTES);
        }
        /*
          Dentistas
         */
        if (cadastroDentistas) {
            permissoes.add(Permissoes.ROLE_CADASTRAR_DENTISTAS);
        }
        if (visualizarDentistas) {
            permissoes.add(Permissoes.ROLE_VISUALIZAR_DENTISTAS);
        }
        if (alterarDentistas) {
            permissoes.add(Permissoes.ROLE_ALTERAR_DENTISTAS);
        }
        if (removerDentistas) {
            permissoes.add(Permissoes.ROLE_REMOVER_DENTISTAS);
        }
        /*
          Usuários
         */
        if (cadastroUsuarios) {
            permissoes.add(Permissoes.ROLE_CADASTRAR_USUARIOS);
        }
        if (visualizarUsuarios) {
            permissoes.add(Permissoes.ROLE_VISUALIZAR_USUARIOS);
        }
        if (alterarUsuarios) {
            permissoes.add(Permissoes.ROLE_ALTERAR_USUARIOS);
        }
        if (removerUsuarios) {
            permissoes.add(Permissoes.ROLE_REMOVER_USUARIOS);
        }
        /*
          Grupos
         */
        if (cadastroGrupos) {
            permissoes.add(Permissoes.ROLE_CADASTRAR_GRUPOS);
        }
        if (visualizarGrupos) {
            permissoes.add(Permissoes.ROLE_VISUALIZAR_GRUPOS);
        }
        if (alterarGrupos) {
            permissoes.add(Permissoes.ROLE_ALTERAR_GRUPOS);
        }
        if (removerGrupos) {
            permissoes.add(Permissoes.ROLE_REMOVER_GRUPOS);
        }
        /*
          Agendamentos
         */
        if (cadastroAgendamentos) {
            permissoes.add(Permissoes.ROLE_CADASTRAR_AGENDAMENTOS);
        }
        if (visualizarAgendamentos) {
            permissoes.add(Permissoes.ROLE_VISUALIZAR_AGENDAMENTOS);
        }
        if (alterarAgendamentos) {
            permissoes.add(Permissoes.ROLE_ALTERAR_AGENDAMENTOS);
        }
        if (removerAgendamentos) {
            permissoes.add(Permissoes.ROLE_REMOVER_AGENDAMENTOS);
        }
        /*
          Ficha Anamnese
         */
        if (cadastroFichaAnamnese) {
            permissoes.add(Permissoes.ROLE_CADASTRAR_FICHA_ANAMNESE);
        }
        if (visualizarFichaAnamnese) {
            permissoes.add(Permissoes.ROLE_VISUALIZAR_FICHA_ANAMNESE);
        }
        if (alterarFichaAnamnese) {
            permissoes.add(Permissoes.ROLE_ALTERAR_FICHA_ANAMNESE);
        }
        if (removerFichaAnamnese) {
            permissoes.add(Permissoes.ROLE_REMOVER_FICHA_ANAMNESE);
        }
        /*
          Procedimentos
         */
        if (cadastroProcedimentos) {
            permissoes.add(Permissoes.ROLE_CADASTRAR_PROCEDIMENTOS);
        }
        if (visualizarProcedimentos) {
            permissoes.add(Permissoes.ROLE_VISUALIZAR_PROCEDIMENTOS);
        }
        if (alterarProcedimentos) {
            permissoes.add(Permissoes.ROLE_ALTERAR_PROCEDIMENTOS);
        }
        if (removerProcedimentos) {
            permissoes.add(Permissoes.ROLE_REMOVER_PROCEDIMENTOS);
        }
        /*
          Pagamentos
         */
        if (cadastroPagamentos) {
            permissoes.add(Permissoes.ROLE_CADASTRAR_PAGAMENTOS);
        }
        if (visualizarPagamentos) {
            permissoes.add(Permissoes.ROLE_VISUALIZAR_PAGAMENTOS);
        }
        if (alterarPagamentos) {
            permissoes.add(Permissoes.ROLE_ALTERAR_PAGAMENTOS);
        }
        if (removerPagamentos) {
            permissoes.add(Permissoes.ROLE_REMOVER_PAGAMENTOS);
        }
        /*
          Movimentacoes
         */
        if (cadastroMovimentacoes) {
            permissoes.add(Permissoes.ROLE_CADASTRAR_MOVIMENTACAO);
        }
        if (visualizarMovimentacoes) {
            permissoes.add(Permissoes.ROLE_VISUALIZAR_MOVIMENTACAO);
        }
        if (alterarMovimentacoes) {
            permissoes.add(Permissoes.ROLE_ALTERAR_MOVIMENTACAO);
        }
        if (removerMovimentacoes) {
            permissoes.add(Permissoes.ROLE_REMOVER_MOVIMENTACAO);
        }
        /*
          Convenios
         */
        if (cadastroConvenios) {
            permissoes.add(Permissoes.ROLE_CADASTRAR_CONVENIOS);
        }
        if (visualizarConvenios) {
            permissoes.add(Permissoes.ROLE_VISUALIZAR_CONVENIOS);
        }
        if (alterarConvenios) {
            permissoes.add(Permissoes.ROLE_ALTERAR_CONVENIOS);
        }
        if (removerConvenios) {
            permissoes.add(Permissoes.ROLE_REMOVER_CONVENIOS);
        }

        permissoes.add(Permissoes.ROLE_ACESSO_SISTEMA);

        return permissoes;
    }

    /**
     * Adiciona as permissões para o formulário
     */
    public void fromForm(List<Permissoes> permissoes) {

        /*
          Clientes
         */
        if (permissoes.contains(Permissoes.ROLE_CADASTRAR_CLIENTES)) {
            cadastroClientes = true;
        }
        if (permissoes.contains(Permissoes.ROLE_VISUALIZAR_CLIENTES)) {
            visualizarClientes = true;
        }
        if (permissoes.contains(Permissoes.ROLE_ALTERAR_CLIENTES)) {
            alterarClientes = true;
        }
        if (permissoes.contains(Permissoes.ROLE_REMOVER_CLIENTES)) {
            removerClientes = true;
        }
        /*
          Dentistas
         */
        if (permissoes.contains(Permissoes.ROLE_CADASTRAR_DENTISTAS)) {
            cadastroDentistas = true;
        }
        if (permissoes.contains(Permissoes.ROLE_VISUALIZAR_DENTISTAS)) {
            visualizarDentistas = true;
        }
        if (permissoes.contains(Permissoes.ROLE_ALTERAR_DENTISTAS)) {
            alterarDentistas = true;
        }
        if (permissoes.contains(Permissoes.ROLE_REMOVER_DENTISTAS)) {
            removerDentistas = true;
        }
        /*
          Usuários
         */
        if (permissoes.contains(Permissoes.ROLE_CADASTRAR_USUARIOS)) {
            cadastroUsuarios = true;
        }
        if (permissoes.contains(Permissoes.ROLE_VISUALIZAR_USUARIOS)) {
            visualizarUsuarios = true;
        }
        if (permissoes.contains(Permissoes.ROLE_ALTERAR_USUARIOS)) {
            alterarUsuarios = true;
        }
        if (permissoes.contains(Permissoes.ROLE_REMOVER_USUARIOS)) {
            removerUsuarios = true;
        }
        /*
          Grupos
         */
        if (permissoes.contains(Permissoes.ROLE_CADASTRAR_GRUPOS)) {
            cadastroGrupos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_ALTERAR_GRUPOS)) {
            alterarGrupos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_VISUALIZAR_GRUPOS)) {
            visualizarGrupos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_REMOVER_GRUPOS)) {
            removerGrupos = true;
        }
        /*
          Agendamentos
         */
        if (permissoes.contains(Permissoes.ROLE_CADASTRAR_AGENDAMENTOS)) {
            cadastroAgendamentos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_VISUALIZAR_AGENDAMENTOS)) {
            visualizarAgendamentos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_ALTERAR_AGENDAMENTOS)) {
            alterarAgendamentos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_REMOVER_AGENDAMENTOS)) {
            removerAgendamentos = true;
        }
        /*
          Ficha Anamnese
         */
        if (permissoes.contains(Permissoes.ROLE_CADASTRAR_FICHA_ANAMNESE)) {
            cadastroFichaAnamnese = true;
        }
        if (permissoes.contains(Permissoes.ROLE_VISUALIZAR_FICHA_ANAMNESE)) {
            visualizarFichaAnamnese = true;
        }
        if (permissoes.contains(Permissoes.ROLE_ALTERAR_FICHA_ANAMNESE)) {
            alterarFichaAnamnese = true;
        }
        if (permissoes.contains(Permissoes.ROLE_REMOVER_FICHA_ANAMNESE)) {
            removerFichaAnamnese = true;
        }
        /*
          Procedimentos
         */
        if (permissoes.contains(Permissoes.ROLE_CADASTRAR_PROCEDIMENTOS)) {
            cadastroProcedimentos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_VISUALIZAR_PROCEDIMENTOS)) {
            visualizarProcedimentos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_ALTERAR_PROCEDIMENTOS)) {
            alterarProcedimentos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_REMOVER_PROCEDIMENTOS)) {
            removerProcedimentos = true;
        }
        /*
          Pagamentos
         */
        if (permissoes.contains(Permissoes.ROLE_CADASTRAR_PAGAMENTOS)) {
            cadastroPagamentos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_VISUALIZAR_PAGAMENTOS)) {
            visualizarPagamentos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_ALTERAR_PAGAMENTOS)) {
            alterarPagamentos = true;
        }
        if (permissoes.contains(Permissoes.ROLE_REMOVER_PAGAMENTOS)) {
            removerPagamentos = true;
        }
        /*
          Movimentacoes
         */
        if (permissoes.contains(Permissoes.ROLE_CADASTRAR_MOVIMENTACAO)) {
            cadastroMovimentacoes = true;
        }
        if (permissoes.contains(Permissoes.ROLE_VISUALIZAR_MOVIMENTACAO)) {
            visualizarMovimentacoes = true;
        }
        if (permissoes.contains(Permissoes.ROLE_ALTERAR_MOVIMENTACAO)) {
            alterarMovimentacoes = true;
        }
        if (permissoes.contains(Permissoes.ROLE_REMOVER_MOVIMENTACAO)) {
            removerMovimentacoes = true;
        }
        /*
          Convenios
         */
        if (permissoes.contains(Permissoes.ROLE_CADASTRAR_CONVENIOS)) {
            cadastroConvenios = true;
        }
        if (permissoes.contains(Permissoes.ROLE_VISUALIZAR_CONVENIOS)) {
            visualizarConvenios = true;
        }
        if (permissoes.contains(Permissoes.ROLE_ALTERAR_CONVENIOS)) {
            alterarConvenios = true;
        }
        if (permissoes.contains(Permissoes.ROLE_REMOVER_CONVENIOS)) {
            removerConvenios = true;
        }
    }

    /*
    Getters e Setters
     */
    public boolean isCadastroClientes() {
        return cadastroClientes;
    }

    public void setCadastroClientes(boolean cadastroClientes) {
        this.cadastroClientes = cadastroClientes;
    }

    public boolean isVisualizarClientes() {
        return visualizarClientes;
    }

    public void setVisualizarClientes(boolean visualizarClientes) {
        this.visualizarClientes = visualizarClientes;
    }

    public boolean isAlterarClientes() {
        return alterarClientes;
    }

    public void setAlterarClientes(boolean alterarClientes) {
        this.alterarClientes = alterarClientes;
    }

    public boolean isRemoverClientes() {
        return removerClientes;
    }

    public void setRemoverClientes(boolean removerClientes) {
        this.removerClientes = removerClientes;
    }

    public boolean isCadastroUsuarios() {
        return cadastroUsuarios;
    }

    public void setCadastroUsuarios(boolean cadastroUsuarios) {
        this.cadastroUsuarios = cadastroUsuarios;
    }

    public boolean isVisualizarUsuarios() {
        return visualizarUsuarios;
    }

    public void setVisualizarUsuarios(boolean visualizarUsuarios) {
        this.visualizarUsuarios = visualizarUsuarios;
    }

    public boolean isAlterarUsuarios() {
        return alterarUsuarios;
    }

    public void setAlterarUsuarios(boolean alterarUsuarios) {
        this.alterarUsuarios = alterarUsuarios;
    }

    public boolean isRemoverUsuarios() {
        return removerUsuarios;
    }

    public void setRemoverUsuarios(boolean removerUsuarios) {
        this.removerUsuarios = removerUsuarios;
    }

    public boolean isCadastroGrupos() {
        return cadastroGrupos;
    }

    public void setCadastroGrupos(boolean cadastroGrupos) {
        this.cadastroGrupos = cadastroGrupos;
    }

    public boolean isVisualizarGrupos() {
        return visualizarGrupos;
    }

    public void setVisualizarGrupos(boolean visualizarGrupos) {
        this.visualizarGrupos = visualizarGrupos;
    }

    public boolean isAlterarGrupos() {
        return alterarGrupos;
    }

    public void setAlterarGrupos(boolean alterarGrupos) {
        this.alterarGrupos = alterarGrupos;
    }

    public boolean isRemoverGrupos() {
        return removerGrupos;
    }

    public void setRemoverGrupos(boolean removerGrupos) {
        this.removerGrupos = removerGrupos;
    }

    public boolean isCadastroDentistas() {
        return cadastroDentistas;
    }

    public void setCadastroDentistas(boolean cadastroDentistas) {
        this.cadastroDentistas = cadastroDentistas;
    }

    public boolean isVisualizarDentistas() {
        return visualizarDentistas;
    }

    public void setVisualizarDentistas(boolean visualizarDentistas) {
        this.visualizarDentistas = visualizarDentistas;
    }

    public boolean isAlterarDentistas() {
        return alterarDentistas;
    }

    public void setAlterarDentistas(boolean alterarDentistas) {
        this.alterarDentistas = alterarDentistas;
    }

    public boolean isRemoverDentistas() {
        return removerDentistas;
    }

    public void setRemoverDentistas(boolean removerDentistas) {
        this.removerDentistas = removerDentistas;
    }

    public boolean isCadastroAgendamentos() {
        return cadastroAgendamentos;
    }

    public void setCadastroAgendamentos(boolean cadastroAgendamentos) {
        this.cadastroAgendamentos = cadastroAgendamentos;
    }

    public boolean isVisualizarAgendamentos() {
        return visualizarAgendamentos;
    }

    public void setVisualizarAgendamentos(boolean visualizarAgendamentos) {
        this.visualizarAgendamentos = visualizarAgendamentos;
    }

    public boolean isAlterarAgendamentos() {
        return alterarAgendamentos;
    }

    public void setAlterarAgendamentos(boolean alterarAgendamentos) {
        this.alterarAgendamentos = alterarAgendamentos;
    }

    public boolean isRemoverAgendamentos() {
        return removerAgendamentos;
    }

    public void setRemoverAgendamentos(boolean removerAgendamentos) {
        this.removerAgendamentos = removerAgendamentos;
    }

    public boolean isCadastroFichaAnamnese() {
        return cadastroFichaAnamnese;
    }

    public void setCadastroFichaAnamnese(boolean cadastroFichaAnamnese) {
        this.cadastroFichaAnamnese = cadastroFichaAnamnese;
    }

    public boolean isVisualizarFichaAnamnese() {
        return visualizarFichaAnamnese;
    }

    public void setVisualizarFichaAnamnese(boolean visualizarFichaAnamnese) {
        this.visualizarFichaAnamnese = visualizarFichaAnamnese;
    }

    public boolean isAlterarFichaAnamnese() {
        return alterarFichaAnamnese;
    }

    public void setAlterarFichaAnamnese(boolean alterarFichaAnamnese) {
        this.alterarFichaAnamnese = alterarFichaAnamnese;
    }

    public boolean isRemoverFichaAnamnese() {
        return removerFichaAnamnese;
    }

    public void setRemoverFichaAnamnese(boolean removerFichaAnamnese) {
        this.removerFichaAnamnese = removerFichaAnamnese;
    }

    public boolean isCadastroProcedimentos() {
        return cadastroProcedimentos;
    }

    public void setCadastroProcedimentos(boolean cadastroProcedimentos) {
        this.cadastroProcedimentos = cadastroProcedimentos;
    }

    public boolean isVisualizarProcedimentos() {
        return visualizarProcedimentos;
    }

    public void setVisualizarProcedimentos(boolean visualizarProcedimentos) {
        this.visualizarProcedimentos = visualizarProcedimentos;
    }

    public boolean isAlterarProcedimentos() {
        return alterarProcedimentos;
    }

    public void setAlterarProcedimentos(boolean alterarProcedimentos) {
        this.alterarProcedimentos = alterarProcedimentos;
    }

    public boolean isRemoverProcedimentos() {
        return removerProcedimentos;
    }

    public void setRemoverProcedimentos(boolean removerProcedimentos) {
        this.removerProcedimentos = removerProcedimentos;
    }

    public boolean isCadastroPagamentos() {
        return cadastroPagamentos;
    }

    public void setCadastroPagamentos(boolean cadastroPagamentos) {
        this.cadastroPagamentos = cadastroPagamentos;
    }

    public boolean isVisualizarPagamentos() {
        return visualizarPagamentos;
    }

    public void setVisualizarPagamentos(boolean visualizarPagamentos) {
        this.visualizarPagamentos = visualizarPagamentos;
    }

    public boolean isAlterarPagamentos() {
        return alterarPagamentos;
    }

    public void setAlterarPagamentos(boolean alterarPagamentos) {
        this.alterarPagamentos = alterarPagamentos;
    }

    public boolean isRemoverPagamentos() {
        return removerPagamentos;
    }

    public void setRemoverPagamentos(boolean removerPagamentos) {
        this.removerPagamentos = removerPagamentos;
    }

    public boolean isCadastroMovimentacoes() {
        return cadastroMovimentacoes;
    }

    public void setCadastroMovimentacoes(boolean cadastroMovimentacoes) {
        this.cadastroMovimentacoes = cadastroMovimentacoes;
    }

    public boolean isVisualizarMovimentacoes() {
        return visualizarMovimentacoes;
    }

    public void setVisualizarMovimentacoes(boolean visualizarMovimentacoes) {
        this.visualizarMovimentacoes = visualizarMovimentacoes;
    }

    public boolean isAlterarMovimentacoes() {
        return alterarMovimentacoes;
    }

    public void setAlterarMovimentacoes(boolean alterarMovimentacoes) {
        this.alterarMovimentacoes = alterarMovimentacoes;
    }

    public boolean isRemoverMovimentacoes() {
        return removerMovimentacoes;
    }

    public void setRemoverMovimentacoes(boolean removerMovimentacoes) {
        this.removerMovimentacoes = removerMovimentacoes;
    }

    public boolean isCadastroConvenios() {
        return cadastroConvenios;
    }

    public void setCadastroConvenios(boolean cadastroConvenios) {
        this.cadastroConvenios = cadastroConvenios;
    }

    public boolean isVisualizarConvenios() {
        return visualizarConvenios;
    }

    public void setVisualizarConvenios(boolean visualizarConvenios) {
        this.visualizarConvenios = visualizarConvenios;
    }

    public boolean isAlterarConvenios() {
        return alterarConvenios;
    }

    public void setAlterarConvenios(boolean alterarConvenios) {
        this.alterarConvenios = alterarConvenios;
    }

    public boolean isRemoverConvenios() {
        return removerConvenios;
    }

    public void setRemoverConvenios(boolean removerConvenios) {
        this.removerConvenios = removerConvenios;
    }

}

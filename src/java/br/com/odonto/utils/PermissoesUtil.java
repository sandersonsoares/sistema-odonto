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

}

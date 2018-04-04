package principal;

import br.com.odonto.dao.EstadoDAO;
import br.com.odonto.enums.Permissoes;
import br.com.odonto.enums.Sexo;
import br.com.odonto.exception.DAOException;
import br.com.odonto.facade.Facade;
import br.com.odonto.interfaces.DaoGeneric;
import br.com.odonto.model.Cidade;
import br.com.odonto.model.Endereco;
import br.com.odonto.model.Estado;
import br.com.odonto.model.EstadoJsonConverter;
import br.com.odonto.model.EstadosJsonConverter;
import br.com.odonto.model.Grupo;
import br.com.odonto.model.Usuario;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sanderson
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Preenchimento de estados e cidades no banco lendo JSON
         */
        DaoGeneric<Estado> estadoDao = new EstadoDAO();

        try (Reader reader = new InputStreamReader(Main.class.getResourceAsStream("cidades.json"), "UTF-8")) {
            Gson gson = new GsonBuilder().create();
            EstadosJsonConverter e = gson.fromJson(reader, EstadosJsonConverter.class);
            for (EstadoJsonConverter estado : e.getEstados()) {
                Estado est = new Estado();
                est.setNome(estado.getNome());
                est.setSigla(estado.getSigla());
                for (String cidade : estado.getCidades()) {
                    Cidade c = new Cidade();
                    c.setNome(cidade);
                    est.getCidades().add(c);
                }
                estadoDao.save(est);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * Geração de tabelas e usuário administrador
         *
         * @user: admin
         * @senha: admin123
         */
        Facade fachada = new Facade();

        Usuario user = new Usuario();
        user.setCpf("888.888.888-88");
        user.setDataNascimento(new Date());
        user.setEmail("admin@admin.com");

        try {
            Endereco endereco = new Endereco();
            endereco.setCep("58704310");
            endereco.setBairro("Belo Horizonte");
            endereco.setEstado(estadoDao.getAll().get(0));
            endereco.setLogradouro("Rua Luiz José");
            endereco.setNumero(624);
            user.setEndereco(endereco);
        } catch (DAOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        List<Permissoes> permissoes = new ArrayList<>();
        for (Permissoes p : Permissoes.values()) {
            permissoes.add(p);
        }

        Grupo gp = new Grupo();
        gp.setTitulo("Administradores");
        gp.setPermissoes(permissoes);

        user.setGrupo(gp);
        user.setNome("Administrador");
        user.setSenha("admin123");
        user.setSexo(Sexo.MASCULINO);
        user.setTelefone("(83) 9999-9999");
        user.setStatus(true);
        user.setUsername("admin");

        try {
            fachada.cadastrarUsuario(user);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

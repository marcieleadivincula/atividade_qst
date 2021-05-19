package Server.Services;

import Server.Entity.Usuario;
import java.util.List;
import java.util.ArrayList;

public class UsuarioService {

    private final UsuarioImp dao = new UsuarioImp();

    public boolean login(Usuario user) {
        if (administrador(user)) {
            return true;
        }
        for (Usuario userCadastrado : dao.getUsuarios()) {
            if (user.getLogin().equals(userCadastrado.getLogin()) && user.getSenha().equals(userCadastrado.getSenha())) {
                return true;
            }
        }
        return false;
    }

    public Boolean administrador(Usuario user) {
        if ("admin".equals(user.getLogin()) && "admin".equals(user.getSenha())) {
            return true;
        }
        return false;
    }

    public void cadastrarUsuario(Usuario user) {
        dao.insertUsuario(user);
    }

    public List<Usuario> getLista() {
        return dao.getUsuarios();
    }

    public void inativarUsuario(Integer codigo) {
        dao.inativarUsuario(codigo);
    }

    public void alterarUsuario(Usuario usuario) {
        dao.alterarUsuario(usuario);
    }

    public List<Usuario> consultar(String nomeConsulta, String usuarioConsulta) {
        List<Usuario> resultado = new ArrayList<>();
        resultado = dao.getUsuariosFilter(nomeConsulta, usuarioConsulta);
        return resultado;
    }

    public Usuario getUsuarioByCodigo(Integer codigo) {
        return dao.getUsuarioById(codigo);
    }
    
    public Usuario ultimoUsuarioInserido() {
        return dao.getUsuarioById(dao.getIdUltimoUsuarioInserido());
    }
    
    public Integer countUsuarios() {
        return getLista().size();
    }
}

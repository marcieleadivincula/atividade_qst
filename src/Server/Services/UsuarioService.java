package Server.Services;

import Server.Entity.Usuario;
import java.util.List;
import java.util.ArrayList;

public class UsuarioService {

    private final List<Usuario> usuarios = new ArrayList();

    public boolean login(Usuario user) {
        if(administrador(user)) {
            return true;
        }
        for (Usuario userCadastrado : this.usuarios) {
            if (user.getNome().equals(userCadastrado.getNome()) && user.getSenha().equals(userCadastrado.getSenha())) {
                return true;
            }
        }
        return false;
    }
    
    public Boolean administrador(Usuario user) {
        if("admin".equals(user.getLogin()) && "admin".equals(user.getSenha())) {
            return true;
        }
        return false;
    }
    
    public void cadastrarUsuario(Usuario user) {
        usuarios.add(user);
    }

    public List<Usuario> getLista() {
        return usuarios;
    }

    public void inativarUsuario(Integer codigo) {
        usuarios.get(codigo).setAtivo("Inativo");
    }
    
    public void alterarUsuario(Usuario usuario, Integer codigo) {
        usuarios.remove(usuarios.get(codigo));
        usuarios.add(codigo, usuario);
    }

    public List<Usuario> consultar(String nomeConsulta, String usuarioConsulta) {
        List<Usuario> resultado = new ArrayList<>();
        for (Usuario user : usuarios) {
            if (nomeConsulta.equals(user.getNome()) || usuarioConsulta.equals(user.getLogin())) {
                resultado.add(user);
            }
        }
        if (nomeConsulta.isEmpty() && usuarioConsulta.isEmpty()) {
            return this.getLista();
        } else {
            return resultado;
        }
    }
    
    public Usuario getUsuarioByCodigo(Integer codigo) {
        return usuarios.get(codigo);
    }
}

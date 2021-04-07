package Server.Services;

import Server.Entity.Usuario;
import java.util.List;
import java.util.ArrayList;

public class UsuarioService {
    
    private List<Usuario> usuarios = new ArrayList();
    
    public boolean login(Usuario user) {
        for(Usuario userCadastrado : this.usuarios) {
            if(user.getNome().equals(userCadastrado.getNome()) && user.getSenha().equals(userCadastrado.getSenha())) {
               return true; 
            }
        }
        return false;
    }
    
    public void cadastrarUsuario(Usuario user) {
        usuarios.add(user);
    }
    
    public List<Usuario> getLista() {
        return usuarios;
    }
    
    public void excluirUsuario(Integer codigo) {
        usuarios.remove(usuarios.get(codigo));
    }
    
}

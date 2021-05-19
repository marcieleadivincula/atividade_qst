package Server.Services;

import Server.Connection.Connection;
import Server.Entity.Usuario;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioImp {

    public List<Usuario> getUsuarios() {
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        List<Usuario> usuarios = new ArrayList<>();
        try {
            sql.append("SELECT * FROM usuarios");
            rs = Connection.executaSelect(sql.toString());
            while (rs.next()) {
                usuarios.add(montarUsuario(rs));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usuarios;
    }

    public void insertUsuario(Usuario user) {
        StringBuilder sql = new StringBuilder();
        try {
            sql.append("INSERT INTO usuarios VALUES (0, ");
            sql.append("'" + user.getLogin() + "',");
            sql.append("'" + user.getSenha() + "',");
            sql.append("'" + user.getNome() + "',");
            sql.append("'Ativo')");
            Connection.executaDataManipulation(sql.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void alterarUsuario(Usuario user) {
        StringBuilder sql = new StringBuilder();
        try {
            sql.append("UPDATE usuarios SET ");
            sql.append("login = '" + user.getLogin() + "',");
            sql.append("senha ='" + user.getSenha() + "',");
            sql.append("nome ='" + user.getNome() + "'");
            sql.append("WHERE id = '" + user.getId() + "'");
            Connection.executaDataManipulation(sql.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void inativarUsuario(Integer codigo) {
        StringBuilder sql = new StringBuilder();
        try {
            sql.append("UPDATE usuarios SET ");
            sql.append("ativo = 'Inativo' ");
            sql.append("WHERE id = '" + codigo + "'");
            Connection.executaDataManipulation(sql.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Usuario getUsuarioById(Integer codigo) {
        ResultSet rs;
        Usuario user = new Usuario();
        StringBuilder sql = new StringBuilder();
        try {
            sql.append("SELECT * FROM usuarios WHERE id = '").append(codigo + "'");
            rs = Connection.executaSelect(sql.toString());
            while (rs.next()) {
                user = montarUsuario(rs);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return user;
    }

    public List<Usuario> getUsuariosFilter(String nomeConsulta, String usuarioConsulta) {
        ResultSet rs;
        StringBuilder sql = new StringBuilder();
        List<Usuario> usuarios = new ArrayList<>();
        try {
            sql.append("SELECT * FROM usuarios WHERE ");
            if (!nomeConsulta.isEmpty()) {
                sql.append(" nome = '" + nomeConsulta + "' AND");
            }
            if (!usuarioConsulta.isEmpty()) {
                sql.append(" login = '" + usuarioConsulta + "' AND");
            }
            sql.replace(sql.length() - 3, sql.length(), "");
            rs = Connection.executaSelect(sql.toString());
            while (rs.next()) {
                usuarios.add(montarUsuario(rs));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return usuarios;
    }
    
    public Integer getIdUltimoUsuarioInserido() {
        StringBuilder sql = new StringBuilder();
        ResultSet rs = null;
        try {
            sql.append("SELECT MAX(ID) id FROM usuarios");
            rs = Connection.executaSelect(sql.toString());
            
            while(rs.next()) {
                return rs.getInt("id");
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }

    private Usuario montarUsuario(ResultSet rs) throws Exception {
        Usuario user = new Usuario();
        user.setId(rs.getInt("id"));
        user.setLogin(rs.getString("login"));
        user.setNome(rs.getString("nome"));
        user.setSenha(rs.getString("senha"));
        user.setAtivo(rs.getString("ativo"));
        return user;
    }

}

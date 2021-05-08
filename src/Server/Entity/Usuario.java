package Server.Entity;

import javax.swing.JOptionPane;

public class Usuario {

    private Integer id;
    private String nome;
    private String login;
    private String senha;
    private String ativo;

    public Usuario() {

    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String nome, String login, String ativo) {
        this.nome = nome;
        this.login = login;
        this.ativo = ativo;
    }

    public Usuario(String nome, String login, String senha, String ativo) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.ativo = ativo;
    }

    public Usuario(Integer id, String nome, String login, String senha, String ativo) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.ativo = ativo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public Boolean validaSenha(String senha) {
        if (senha.length() >= 8 && senha.length() < 10) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "A senha deve conter 8 a 10 caracteres somente");
            return false;
        }
    }

}

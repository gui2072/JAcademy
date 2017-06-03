package br.unipe.cc.mpl3.jacademy.modelo;
import br.unipe.cc.mpl3.jacademy.persistencia.RepositorioLogin;

/**
 *
 * @author paulo
 */
public class Login {
    private String usuario;
    private String senha;

    private final RepositorioLogin repositorioLogin = new RepositorioLogin();

    public Login() {
    }

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean validar(){
        return repositorioLogin.validarLogin(this.usuario, this.senha);
    }
}

package br.unipe.cc.mpl3.jacademy.fachada;
import br.unipe.cc.mpl3.jacademy.modelo.Login;

/**
 *
 * @author paulo
 */
public class FachadaLogin {
    private final Login login = new Login();

    public boolean logar(String usuario, String senha) {
        login.setUsuario(usuario);
        login.setSenha(senha);

        return login.validar();
    }
}

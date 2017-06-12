package br.unipe.cc.mpl3.jacademy.fachada;
import br.unipe.cc.mpl3.jacademy.modelo.Login;
import br.unipe.cc.mpl3.jacademy.persistencia.RepositorioLogin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paulo
 */
public class FachadaLogin {
    private final Login login = new Login();

    public boolean logar(String id, String senha) {
        login.setUsuario(id);
        login.setSenha(senha);

        return login.validar();
    }
    
    public static List busca() {
        List<Object> list = new ArrayList<>();
        
        for (Login login : Login.getUsuarios()){
            list.add(new Object[]{login.getId(),login.getUsuario()});
        }
        
        return list;
    }
    
    public boolean salvar(Login login){
        RepositorioLogin rp = new RepositorioLogin();  
        return rp.inserir(login);
    }
    
    public boolean deletar(String id){
        RepositorioLogin rp = new RepositorioLogin();  
        return rp.deletar(id);
    }
}

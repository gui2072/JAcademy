package br.unipe.cc.mpl3.jacademy.modelo;

import br.unipe.cc.mpl3.jacademy.persistencia.RepositorioProfessor;
import java.util.List;

/**
 *
 * @author bruno
 */

public class Professor extends Pessoa {

    private String situacao, obs, titularidade;
    
    public Professor(){
        
    }

    public String getsituacao() {
        return situacao;
    }

    public String getobs() {
        return obs;
    }
    
        public String gettitularidade() {
        return titularidade;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    public void setTitularidade(String titularidade) {
        this.titularidade = titularidade;
    }
    
    public static List<Professor> getProfessores(){
        
        RepositorioProfessor repositorioProfessor = new RepositorioProfessor();
        
        return repositorioProfessor.getProfessores();
    }
    
    public static List<Professor> busca(String desc){
        
        RepositorioProfessor repositorioProfessor = new RepositorioProfessor();
        
        return repositorioProfessor.busca(desc);
    }
}

package br.unipe.cc.mpl3.jacademy.modelo;

import br.unipe.cc.mpl3.jacademy.persistencia.RepositorioProfessor;
import java.util.Date;
import java.util.List;

/**
 *
 * @author bruno
 */

public class Professor extends Pessoa {

    private String situacao, obs, titularidade;


    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getTitularidade() {
        return titularidade;
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

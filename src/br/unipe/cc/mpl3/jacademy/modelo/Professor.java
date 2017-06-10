package br.unipe.cc.mpl3.jacademy.modelo;
import java.util.Date;

/**
 *
 * @author bruno
 */

public class Professor extends Pessoa {
    private Date dataContratacao;
    private String situacao, obs, titularidade;
    
    public Professor(){
        
    }

    public Date getdataContratacao() {
        return dataContratacao;
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

    public void setdataContratacao(Date DataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setSituacao(String Situacao) {
        this.situacao = situacao;
    }

    public void setObs(String Obs) {
        this.obs = obs;
    }
    
    public void setTitularidade(String Titularidade) {
        this.titularidade = titularidade;
    }
    
}

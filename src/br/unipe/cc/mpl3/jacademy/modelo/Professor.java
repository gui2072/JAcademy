package br.unipe.cc.mpl3.jacademy.modelo;
import java.util.Date;

/**
 *
 * @author Nitai Charan
 */
public class Professor extends Pessoa {

    private Date dataContra;
    private String titularidade;

    public Date getDataContra() {
        return dataContra;
    }

    public void setDataContra(Date dataContra) {
        this.dataContra = dataContra;
    }

    public String getTitularidade() {
        return titularidade;
    }

    public void setTitularidade(String titularidade) {
        this.titularidade = titularidade;
    }
}

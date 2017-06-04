package br.unipe.cc.mpl3.jacademy.modelo;
import java.util.Date;

/**
 *
 * @author Nitai Charan
 */
public class Aluno extends Pessoa {

    private Date dataMatricu;

    public Date getDataMatricu() {
        return dataMatricu;
    }

    public void setDataMatricu(Date dataMatricu) {
        this.dataMatricu = dataMatricu;
    }
}

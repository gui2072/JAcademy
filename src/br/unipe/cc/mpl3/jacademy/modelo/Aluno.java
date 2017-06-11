package br.unipe.cc.mpl3.jacademy.modelo;
import br.unipe.cc.mpl3.jacademy.persistencia.RepositorioAluno;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Nitai Charan
 */
public class Aluno extends Pessoa {

    private Date dataMatricula;
    private String situacao;

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public static Set<Aluno> getAlunos() {
        return RepositorioAluno.getAlunos();
    }
}

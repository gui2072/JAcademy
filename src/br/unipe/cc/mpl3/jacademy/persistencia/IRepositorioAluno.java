package br.unipe.cc.mpl3.jacademy.persistencia;

import br.unipe.cc.mpl3.jacademy.modelo.Aluno;
import java.util.List;

/**
 *
 * @author paulo
 */
public interface IRepositorioAluno {
    public boolean insert(Aluno aluno);
    public boolean update(Aluno aluno);
    public boolean remove(String matricula); 
    public List<Aluno> list(String busca);
    public Aluno get(String matricula);
}

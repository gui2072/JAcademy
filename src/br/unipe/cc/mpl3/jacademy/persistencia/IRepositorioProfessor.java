package br.unipe.cc.mpl3.jacademy.persistencia;

import java.util.List;

import br.unipe.cc.mpl3.jacademy.modelo.Professor;

/**
 * @author bruno
 */
public interface IRepositorioProfessor {
    
    public boolean inserir(Professor professor);
    public List<Professor> getProfessores();
    public boolean atualizar(Professor professor);
    public boolean deletar(String id); 
    public Professor getProfessor(String id);
    public List<Professor> busca(String desc);
}
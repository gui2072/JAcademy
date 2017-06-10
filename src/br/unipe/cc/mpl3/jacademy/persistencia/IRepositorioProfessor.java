package br.unipe.cc.mpl3.jacademy.persistencia;

import br.unipe.cc.mpl3.jacademy.modelo.Professor;
import java.util.List;

/**
 * Contrato de persistência para a entidade <code>Professor</code>. 
 * 
 * <p>Define as operações basicas de cadastro (CRUD).</p>
 * 
 * @author bruno
 */
public interface IRepositorioProfessor {
    
    /**
    * Faz a inserção do professor na base de dados.
    * @param professor
    * @return boolean
    */
    public boolean inserir(Professor professor);
    
    /**
    * Lista todos os professores na base de dados.
    * @return List
    */
    public List<Professor> listar();
    
    /**
    * Faz a atualização do professor na base de dados.
    * @param professor
    */
    public boolean atualizar(Professor professor);
    
    /**
    * Deleta o professor na base de dados. 
    * @return boolean
    */
    public boolean deletar(String id);   

}

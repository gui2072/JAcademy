package br.unipe.cc.mpl3.jacademy.fachada;

import br.unipe.cc.mpl3.jacademy.modelo.Professor;
import br.unipe.cc.mpl3.jacademy.persistencia.RepositorioProfessor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bruno
 */
public class FachadaProfessor {
    
    public static List busca() {
        List<Object> list = new ArrayList<>();
        
        for (Professor professor : Professor.getProfessores()){
            list.add(new Object[]{professor.getMatricula(),professor.getCpf(),professor.getNome(),professor.getTelefone()});
        }
        
        return list;
    }
    
    public static List busca(String desc) {
        List<Object> list = new ArrayList<>();
        
        for (Professor professor : Professor.busca(desc)){
            list.add(new Object[]{professor.getMatricula(),professor.getCpf(),professor.getNome(),professor.getTelefone()});
        }
        
        return list;
    }
    
    public boolean salvar(Professor professor){
        RepositorioProfessor rp = new RepositorioProfessor();  
        return rp.inserir(professor);
    }
    
    public boolean atualizar(Professor professor){
        RepositorioProfessor rp = new RepositorioProfessor();  
        return rp.atualizar(professor);
    }
    
    public boolean deletar(String id){
        RepositorioProfessor rp = new RepositorioProfessor();  
        return rp.deletar(id);
    }
    
    public Professor getProfessor(String id){
        RepositorioProfessor rp = new RepositorioProfessor();  
        
        return rp.getProfessor(id);
    }
}

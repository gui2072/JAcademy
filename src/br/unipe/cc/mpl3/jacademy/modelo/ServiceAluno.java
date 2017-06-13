/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.modelo;

import br.unipe.cc.mpl3.jacademy.persistencia.RepositorioAluno;
import java.util.List;

/**
 *
 * @author paulo
 */
public class ServiceAluno {
    public static List<Aluno> listar(String buscar){
        return (new RepositorioAluno()).list(buscar);
    }
    
    public static void insert(Aluno aluno){
        (new RepositorioAluno()).insert(aluno);
    }
    
    public static void update(Aluno aluno){
        (new RepositorioAluno()).update(aluno);
    }
    
    public static void remove(String matricula){
        (new RepositorioAluno()).remove(matricula);
    }
}

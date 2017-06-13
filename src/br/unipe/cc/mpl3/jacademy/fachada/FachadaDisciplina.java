/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.fachada;

import br.unipe.cc.mpl3.jacademy.modelo.Disciplina;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dan
 */
public class FachadaDisciplina {
    
    /**
     * Retorna lista de Objetos Disciplina para tratamento na interfece
     * grafica.
     * Posibilita query's para resgate de 
     * disciplina (SELECT * FROM disciplina query) no BD.
     * 
     * @author Nitai Charan
     * @param query
     * @return Resultado da query realizado no BD emconjunto List de Disciplina
    */
    public static List getDadoDisciplina(String query){
        List<Object> lista = new ArrayList<>();
        for (Disciplina disciplina : new Disciplina().getDadoDisciplina()) {
            lista.add(new Object[]{disciplina.getId(),disciplina.getNome(),disciplina.getDescricao(),disciplina.getSituacao(),disciplina.getSemestre(),disciplina.getObservacao()});
        }
        return lista;
    }
}

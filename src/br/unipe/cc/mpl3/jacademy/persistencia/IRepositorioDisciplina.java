/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.persistencia;

import br.unipe.cc.mpl3.jacademy.modelo.Disciplina;
import java.util.Set;

/**
 *
 * @author dan
 */
public interface IRepositorioDisciplina {
    public Set<Disciplina> getDadosDisciplina();
    
}

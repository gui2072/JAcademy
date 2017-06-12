/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.modelo;

import br.unipe.cc.mpl3.jacademy.persistencia.RepositorioLeciona;
import java.util.Set;

/**
 *
 * @author dan
 */
public class Leciona {
    private int idProfessor;
    private int idTurma;

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }
    public static Set<Leciona> getSelecionas() {
        return RepositorioLeciona.getLecionas();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.modelo;

import br.unipe.cc.mpl3.jacademy.persistencia.RepositorioTurma;
import java.util.Set;


/**
 *
 * @author dan
 */
public class Turma {

    private int id;
    private String nome;
    private String turno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public static Set<Turma> getDadoTurma(String query) {
        return RepositorioTurma.getDadoTurmas(query);
    }

    @Override
    public String toString() {
        return "Turma{" + "nome=" + nome + '}';
    }
}

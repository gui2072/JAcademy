/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.persistencia;

import br.unipe.cc.mpl3.jacademy.modelo.Disciplina;
import br.unipe.cc.mpl3.jacademy.modelo.Professor;

/**
 *
 * @author Nitai Charan
 */
public class Registro implements IRegistro {

    public boolean registroDisciplina() {
        RepositorioDisciplina disciplinas = new RepositorioDisciplina();
        Boolean resultado = false;
        for (Disciplina disciplina : new RepositorioDisciplina().getDadosDisciplina()) {

        }
        return resultado;
    }

    public boolean registroProfessor() {
        Boolean resultado = false;
        for (Professor professor : new RepositorioProfessor().getProfessores()) {
            professor.getMatricula();
            professor.getProfissao();
            professor.getTitularidade();
            professor.getNome();
            professor.getRg();
            professor.getCpf();
            professor.getSexo();
            professor.getEmail();
            professor.getTelefone();
            professor.getLogradouro();
            professor.getBairro();
            professor.getCidade();
            professor.getEstado();
            professor.getCep();
            professor.getObservacao();

        }
        return resultado;
    }

}

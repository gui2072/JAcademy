/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.persistencia;

import br.unipe.cc.mpl3.jacademy.modelo.Disciplina;
import br.unipe.cc.mpl3.jacademy.modelo.Professor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nitai Charan
 */
public class RepositorioRegistro implements IRegistro {

    public boolean registroDisciplina() {
        Boolean resultado = false;
        File arquivo = new File("relatorio.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(arquivo);
        } catch (IOException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);

        for (Disciplina disciplina : new RepositorioDisciplina().getDadosDisciplina()) {
            try {
                bw.write("ID: " + disciplina.getId());
                bw.write(" Nome: " + disciplina.getNome());
                bw.write(" Descrição: " + disciplina.getDescricao());
                bw.newLine();
            } catch (IOException ex) {
                System.out.println(ex);
                ex.printStackTrace();
            }
        }
        try {
            bw.close();
            fw.close();
            resultado = true;
        } catch (IOException ex) {
            System.out.println(ex);
            ex.printStackTrace();
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

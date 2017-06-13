/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.modelo;

import br.unipe.cc.mpl3.jacademy.persistencia.RepositorioDisciplina;
import java.util.Set;

/**
 *
 * @author Nitai Charan
 */
public class Disciplina {

    private int id;
    private String nome, descricao, situacao, semestre, observacao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * Retorna conjunto de Objetos Disciplina para tratamento na interfece
     * grafica.
     * Posibilita query's para resgate de turma (SELECT * FROM disciplina query) 
     * no BD.
     * 
     * @author Nitai Charan
     * @param query
     * @return Resultado da query realizado no BD em conjunto Set de Disciplina
    */
    public Set<Disciplina> getDadoDisciplina() {
        return new RepositorioDisciplina().getDadosDisciplina();
    }

}

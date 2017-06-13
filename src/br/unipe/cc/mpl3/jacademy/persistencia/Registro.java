/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.persistencia;

import br.unipe.cc.mpl3.jacademy.modelo.Disciplina;

/**
 *
 * @author Nitai Charan
 */
public class Registro implements IRegistro {

    public static void main(String args[]) {
        Registro regis = new Registro();
        
        if (regis.registroDisciplina()) {
            System.out.println("Deu certo");
        } else {
            System.out.println("Não deu");
        }

    }

    public boolean registroDisciplina() {
        RepositorioDisciplina disciplinas = new RepositorioDisciplina();
        Boolean resultado = false ;
        for(Disciplina disciplina  : new RepositorioDisciplina().getDadosDisciplina()){
                        
        }
        return resultado;
    }

}

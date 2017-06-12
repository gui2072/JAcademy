/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.fachada;

import br.unipe.cc.mpl3.jacademy.modelo.Leciona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dan
 */
public class FachadaLeciona {

    public static List<Object> getLecionas() {
        List<Object> lista = new ArrayList<>();
        for (Leciona leciona : Leciona.getSelecionas()) {
            lista.add(new Object[]{leciona.getIdProfessor(), leciona.getIdTurma()});
        }
        return lista;
    }

}

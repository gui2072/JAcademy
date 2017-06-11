/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.fachada;

import br.unipe.cc.mpl3.jacademy.modelo.Aluno;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author paulo
 */
public abstract class FachadaAluno {

    public static List busca(String busca){
        List<Object> lista = new ArrayList<>();
        lista.add(new Object[]{"4641","Oasfwe","132.156.466-45"});
        
        return lista;
    }
}

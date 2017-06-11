/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.fachada;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author paulo
 */
public abstract class FachadaAluno {

    public static List busca(String busca){
        List<Object> lista = new ArrayList<>();
    
        lista.add(new Object[]{"A171","Paulo","123.123.123-56"});
        lista.add(new Object[]{"A173","Nitai","796.856.265-53"});
        
        return lista;
    }
}

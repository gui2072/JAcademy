/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.fachada;

import br.unipe.cc.mpl3.jacademy.persistencia.RepositorioRegistro;

/**
 *
 * @author bruno
 */
public class FachadaRelatorios {
    
    public boolean gerar(){
        RepositorioRegistro registro = new RepositorioRegistro();
            
        return registro.registroDisciplina();
    }
    
}

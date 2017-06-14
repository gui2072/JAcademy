/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.persistencia;


/**
 *
 * @author paulo
 */
public class RegistroTest {
    Registro registro;
    
    public void setUp() {
        registro = new Registro();
    }

    /**
     * Test of registroDisciplina method, of class Registro.
     */
    public void testRegistroDisciplina() {
        Assertment.assertTrue(registro.registroDisciplina());
    }
    
}

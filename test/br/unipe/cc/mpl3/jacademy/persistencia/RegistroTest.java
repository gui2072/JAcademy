/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.persistencia;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author paulo
 */
public class RegistroTest {
    Registro registro;
    
    @Before
    public void setUp() {
        registro = new Registro();
    }

    /**
     * Test of registroDisciplina method, of class Registro.
     */
    @Test
    public void testRegistroDisciplina() {
        Assert.assertTrue(registro.registroDisciplina());
    }
    
}

package br.unipe.cc.mpl3.jacademy.fachada;

import br.unipe.cc.mpl3.jacademy.modelo.Turma;
import java.util.ArrayList;
import java.util.List;

/**
 * Retorna lista de Objetos Turma para tratamento na interfece
 * grafica.
 * Posibilita query's para resgate de turma (SELECT * FROM turma query) 
 * no BD.
 * 
 * @author paulo
 * @param query
 * @return Resultado da query realizado no BD em um conjunto List de Turma.
*/
public class FachadaTurma {
    public static List getDadoTurma(String query) {
        List<Object> lista = new ArrayList<>();
        for (Turma turma : Turma.getDadoTurma(query)) {
            lista.add(new Object[]{turma.getNome(), null, null, turma.getTurno()});
        }
        return lista;
    }
}

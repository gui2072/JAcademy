package br.unipe.cc.mpl3.jacademy.fachada;

import br.unipe.cc.mpl3.jacademy.modelo.Turma;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paulo
 */
public class FachadaTurma {

    public static List getTurmas() {
        List<Object> lista = new ArrayList<>();
        for (Turma turma : Turma.getTurmas()) {
            lista.add(new Object[]{turma.getNome(), null, null, turma.getTurno()});
        }
        return lista;
    }

    public static List get1Dado(String query, String dado) {
        List<Object> lista = new ArrayList<>();
        for (Turma turma : Turma.get1Dado(query,dado)) {
            lista.add(new Object[]{turma.getNome(), null, null, turma.getTurno()});
        }

        return lista;
    }
}

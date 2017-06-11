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

    public static List busca() {
        List<Object> lista = new ArrayList<>();
        for (Turma turma : Turma.getTurmas()){
            lista.add(new Object[]{turma.getNome(),null,null,turma.getTurno()});
        }
        return lista;
    }
}

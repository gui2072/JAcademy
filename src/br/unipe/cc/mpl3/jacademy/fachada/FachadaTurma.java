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

    public static void setNomeTurma(String nome) {
        Turma turma = new Turma();
        turma.setNome(nome);
    }

    public static void setIdTurma(int id) {
        Turma turma = new Turma();
        turma.setId(id);
    }

    public static void setTurnoTurma(String turno) {
        Turma turma = new Turma();
        turma.setTurno(turno);
    }

    public static Turma getTurma() {
        Turma turma = new Turma();
        return turma;
    }

    public static List getTurmas() {
        return Turma.getTurmas();
    }
}

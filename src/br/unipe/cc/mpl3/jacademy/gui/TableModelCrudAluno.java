/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.gui;

import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author paulo
 */
public class TableModelCrudAluno  extends AbstractTableModel {
    private final List<Vector> lista;

    public TableModelCrudAluno(List<Vector> lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vector vetor = lista.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return vetor.get(0);
            case 1:
                return vetor.get(1);
            case 2:
                return vetor.get(2);
    }
    return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.persistencia;

import br.unipe.cc.mpl3.jacademy.modelo.Turma;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dan
 */
public class RepositorioTurma {
    public static List<Turma> getTurmas() {
        List<Turma> turmas = new ArrayList<>();
        try {
            DataBase database = new DataBase();
            ResultSet resultSet = database.getStatement().executeQuery("SELECT id, nome, turno FROM turma");
            while (resultSet.next()) {
                Turma turma = new Turma();
                turma.setId(resultSet.getInt("id"));
                turma.setNome(resultSet.getString("nome"));
                turma.setTurno(resultSet.getString("turno"));
                turmas.add(turma);
            }
            database.close();
            database.getStatement().close(); // Em avaliação
            resultSet.close();
        } catch (SQLException ex) {
        } finally {

        }
        return turmas;
    }

}

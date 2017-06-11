/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.persistencia;

import br.unipe.cc.mpl3.jacademy.modelo.Aluno;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author paulo
 */
public class RepositorioAluno {

    public static Set<Aluno> getAlunos() {
        Set<Aluno> alunos = new HashSet<>();

        try {
            DataBase database = new DataBase();
            ResultSet resultSet = database.getStatement().executeQuery("SELECT * FROM aluno");
            while (resultSet.next()) {
                Aluno aluno = new Aluno();
                aluno.setSexo(resultSet.getString("sexo"));
                aluno.setTelefone(resultSet.getString("telefone"));
                aluno.setProfissao(resultSet.getString("profissao"));
                aluno.setObservacao(resultSet.getString("observacao"));
                aluno.setEmail(resultSet.getString("email"));
                aluno.setRg(resultSet.getString("rg"));
                aluno.setNome(resultSet.getString("nome"));
                aluno.setDataMatricula(resultSet.getDate("data_matricula"));
                aluno.setSituacao(resultSet.getString("situacao"));
                aluno.setDataNasc(resultSet.getDate("data_nascimento"));
                aluno.setEstadoCivil(resultSet.getString("estado_civil"));
                aluno.setMatricula(resultSet.getInt("Matricula"));
                alunos.add(aluno);
            }

            database.close();
            database.getStatement().close(); // Em avaliação
            resultSet.close();
        } catch (SQLException e) {

        }

        return null;
    }
}

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
    public static Set<Aluno> listAlunos(String busca) {
        Set<Aluno> alunos = new HashSet<>();

        try {
            DataBase database = new DataBase();
            Statement statement = database.getStatement();
            ResultSet resultSet = database.getResultSet();
            
            
            
            while(resultSet.next()){
            
            }
        
            database.close();
        } catch (SQLException e){
            
        } 
        
        
        
        return
    }
}

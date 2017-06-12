/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipe.cc.mpl3.jacademy.persistencia;

import br.unipe.cc.mpl3.jacademy.modelo.Aluno;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author paulo
 */
public class RepositorioAluno{

    //public boolean inserir(Aluno aluno){
    //    boolean retorno = false;
    //    
    //    try {
    //        DataBase database = new DataBase();
    //        
    //        String sql = "INSERT INTO aluno(data_matricula, situacao, profissao, nome, identidade, cpf, estado_civil, sexo, data_nascimento, email, telefone, endereco, bairro, cidade, estado, cep, observacao) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    //        save(sql, aluno.getDataMatricula(), aluno.getSituacao(),aluno.getProfissao(), aluno.getNome(), aluno.getRg(), aluno.getCpf(), aluno.getEstadoCivil(),aluno.getSexo(),aluno.getDataNasc(),aluno.getEmail(),aluno.getTelefone(),aluno.getLogradouro(), aluno.getBairro(), aluno.getCidade(), aluno.getEstado(), aluno.getCep(),aluno.getObservacao());
    //        retorno = true;
    //    } catch (SQLException e) {
    //    }
        
    
    //    return retorno;
    //}
    
    
    
    
    
    
    
    
    
    
    public static Set<Aluno> getDadoAluno(String query) {
        Set<Aluno> alunos = new HashSet<>();

        try {
            DataBase database = new DataBase();
            ResultSet resultSet = database.getStatement().executeQuery(query);
            while (resultSet.next()) {
                Aluno aluno = new Aluno();
                aluno.setSexo(resultSet.getString("sexo"));
                aluno.setTelefone(resultSet.getString("telefone"));
                aluno.setProfissao(resultSet.getString("profissao"));
                aluno.setObservacao(resultSet.getString("observacao"));
                aluno.setEmail(resultSet.getString("email"));
                aluno.setRg(resultSet.getString("identidade"));
                aluno.setNome(resultSet.getString("nome"));
                aluno.setSituacao(resultSet.getString("situacao"));
                aluno.setEstadoCivil(resultSet.getString("estado_civil"));
                aluno.setMatricula(resultSet.getInt("Matricula"));
                alunos.add(aluno);
            }

            database.close();
            database.getStatement().close(); // Em avaliação
            resultSet.close();
        } catch (SQLException e) {

        }
        return alunos;
    }
}

package br.unipe.cc.mpl3.jacademy.persistencia;

import br.unipe.cc.mpl3.jacademy.modelo.Professor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bruno
 */
public class RepositorioProfessor extends RepositorioGenerico implements IRepositorioProfessor{

    private DataBase database;

    @Override
    public boolean inserir(Professor professor) {

        boolean resultado = false;

        try {
            
            String sql = "INSERT INTO Professor(observacao, telefone, email, data_nascimento, cpf, matricula, sexo, profissao, situacao, identidade, data_contratacao, estado_civil, titularidade, nome, endereco, cidade, cep, estado, bairro, uf) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            save(sql, professor.getobs(),professor.getTelefone(),professor.getEmail(),professor.getDataNasc(),professor.getCpf(),professor.getMatricula(),professor.getSexo(),professor.getProfissao(),professor.getsituacao(),professor.getRg(),professor.getdataContratacao(),professor.getEstadoCivil() ,professor.gettitularidade(),professor.getNome(),professor.getLogradouro(),professor.getCidade(),professor.getCep(),professor.getBairro(),professor.getId());
            resultado = true;
            
        } catch (SQLException e) {
            
        }

        return resultado;
    }

    @Override
    public boolean deletar(String id) {

        boolean resultado = false;

        try {
            
            String sql = "delete from Professor where id = ?";
            delete(sql, id);
            resultado = true;

        } catch (SQLException e) {
            
        }

        return resultado;
    }

    @Override
    public List<Professor> listar() {

        List<Professor> professores = new ArrayList<Professor>();

        try {

            database = new DataBase();
            String sql = "SELECT id, nome, cpf, matricula FROM Professor order by id";
            ResultSet rs = database.getStatement().executeQuery(sql);

            while (rs.next()) {
                Professor professor = new Professor();

                professor.setId(rs.getInt("id"));
                professor.setMatricula(rs.getString("matricula"));
                professor.setNome(rs.getString("nome"));
                professor.setCpf(rs.getString("cpf"));

                professores.add(professor);
            }

            database.close();

        } catch (SQLException e) {
            
        }

        return professores;
    }

    @Override
    public boolean atualizar(Professor professor) {

        boolean resultado = false;
        
        try {

            String sql = "update Professor set obs = ?"
                    + "Telefone = ?,"
                    + "Email = ?"
                    + "data_nascimento = ?"
                    + "Telefone = ?"
                    + "matricula = ?"
                    + "sexo = ?"
                    + "profissao = ?"
                    + "situacao = ?"
                    + "rg = ?"
                    + "data_contratacao = ?"
                    + "estadocivil = ?"
                    + "titularidade = ?,"
                    + "nome = ?"
                    + "endereco = ?"
                    + "cidade = ?"
                    + "cep = ?"
                    + "bairro = ?"
                    + "where id = ?";
    
            update(sql, professor.getobs(),professor.getTelefone(),professor.getEmail(),professor.getDataNasc(),professor.getCpf(),professor.getMatricula(),professor.getSexo(),professor.getProfissao(),professor.getsituacao(),professor.getRg(),professor.getdataContratacao(),professor.getEstadoCivil() ,professor.gettitularidade(),professor.getNome(),professor.getLogradouro(),professor.getCidade(),professor.getCep(),professor.getBairro(),professor.getId());
            resultado = true;
        } catch (SQLException ex) {
            
        }
        
        return resultado;
    }
}

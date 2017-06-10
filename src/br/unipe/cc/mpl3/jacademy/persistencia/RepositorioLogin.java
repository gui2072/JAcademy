package br.unipe.cc.mpl3.jacademy.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class RepositorioLogin {

    private DataBase database;

    public boolean validarLogin(String usuario, String senha) {
        boolean retorno = false;

        try {
            database = new DataBase();
            ResultSet resultSet = database.getStatement().executeQuery("SELECT COUNT(0) FROM login WHERE usuario = \'" + usuario + "\' AND senha = \'" + senha + "\'");

            if (resultSet.next() && (resultSet.getInt(1) == 1)) {
                retorno = true;
            }

            database.close();
        } catch (SQLException ex) {
        }
        return retorno;
    }
}

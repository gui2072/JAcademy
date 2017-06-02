package br.unipe.cc.mpl3.jacademy.persistencia;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * Classe para a conexão com a base de dados em MySQL
 * @author paulo
 */
public class DataBase {
    private Connection connection;
    private Statement statement;

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public DataBase() throws SQLException {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("config/dataBase.properties"));
            Class.forName("com.mysql.jdbc.Driver");

            this.connection = DriverManager.getConnection("jdbc:mysql://" + properties.getProperty("endereco") + ":" + properties.getProperty("porta") + "/" + properties.getProperty("database"), properties.getProperty("usuario"), properties.getProperty("senha"));
            this.statement = connection.createStatement();
        } catch (ClassNotFoundException ex) {
        } catch (IOException ex) {
        }
    }

    public void close() throws SQLException{
        this.connection.close();
    }
}

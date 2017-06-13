package br.unipe.cc.mpl3.jacademy.persistencia;
import br.unipe.cc.mpl3.jacademy.util.DriveException;
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

    public DataBase() throws SQLException, DriveException {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("config/dataBase.properties"));
            Class.forName("com.mysql.jdbc.Driver");

            this.connection = DriverManager.getConnection("jdbc:mysql://" + properties.getProperty("endereco") + ":" + properties.getProperty("porta") + "/" + properties.getProperty("database"), properties.getProperty("usuario"), properties.getProperty("senha"));
            this.statement = connection.createStatement();
        } catch (ClassNotFoundException ex) {
            throw new DriveException("");
        } catch (IOException ex) {
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void close() throws SQLException{
        this.statement.close();
        this.connection.close();
    }
}

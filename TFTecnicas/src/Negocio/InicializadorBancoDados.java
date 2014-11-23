/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Connection;
import javax.sql.DataSource;

import org.apache.derby.jdbc.ClientConnectionPoolDataSource;


/**
 *
 * @author Indy
 */
import com.omertron.themoviedbapi.MovieDbException;
import com.omertron.themoviedbapi.TheMovieDbApi;

public class InicializadorBancoDados {

    public static String DB_NAME = "TrabalhoFinal";
    public static String USER_NAME = "usuario";
    public static String PASSWORD = "senha";
    private static DataSource dataSource;
    private TheMovieDbApi tmdb;
    String chave = "7f33d776068a7e8045c703100347fd69";
    private static InicializadorBancoDados inicializadorBD;

    private InicializadorBancoDados() throws MovieDbException {
        tmdb = new TheMovieDbApi(chave);
    }

    private static DataSource criarDataSource() throws Exception {
        if (dataSource == null) {
            ClientConnectionPoolDataSource ds = new ClientConnectionPoolDataSource();
            ds.setDatabaseName(DB_NAME);
            ds.setUser(USER_NAME);
            ds.setPassword(PASSWORD);
            dataSource = ds;
        }
        return dataSource;
    }

    public static Connection conectarBd() throws Exception {
        return criarDataSource().getConnection();
    }

    public static InicializadorBancoDados getInicializador() throws MovieDbException {
        if (inicializadorBD == null) {
            inicializadorBD = new InicializadorBancoDados();
        }
        return inicializadorBD;
    }

    public TheMovieDbApi getTmdb() {
        return tmdb;
    }
}
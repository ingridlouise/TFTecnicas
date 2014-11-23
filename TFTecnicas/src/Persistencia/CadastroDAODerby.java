/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;

import Negocio.CadastroDAOException;
import Negocio.Filme;
/**
 *
 * @author Francielle
 */
public class CadastroDAODerby {
    public boolean adicionarFilme(Filme f) throws CadastroDAOException{
        String sql = "insert into FILMES (ID, NOME, POSTER, ANOLANCAMENTO, SINOPSE, DIRETOR, ATORES) values (?,?,?,?,?,?,?)";
        return true;
    }
}

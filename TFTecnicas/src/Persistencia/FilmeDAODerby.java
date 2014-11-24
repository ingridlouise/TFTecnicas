/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;

import Negocio.DAOFilmeException;
import Negocio.Filme;
import Negocio.FilmeDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Francielle
 */
public class FilmeDAODerby implements FilmeDAO {
    
    
    public FilmeDAODerby(){
        
    }

    @Override
    public void addFilme(Filme filme) throws Exception{
        //String sql = "insert into FILMES (ID, NOME, CARTAZ, ANOLANCAMENTO, SINOPSE, DIRETOR, ATORES) values (?,?,?,?,?,?,?)";
        String sql = "insert into USUARIO.FILMES (ID, NOME, CARTAZ, ANOLANCAMENTO, SINOPSE, DIRETOR, ATORES) values (?,?,?,?,?,?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDados.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setInt(1, filme.getId());
                comando.setString(2, filme.getNome());
                comando.setString(3, filme.getPoster());
                comando.setInt(4, filme.getAnoLancamento());
                comando.setString(5, filme.getSinopse());
                comando.setString(6, filme.getDiretor());
                String atoresFilme = "";
                for (String atores : filme.getAtores()) {
                    atoresFilme += atores + ", ";
                }
                if(atoresFilme.length() > 600){
                    atoresFilme = atoresFilme.substring(0, 600);
                }
                comando.setString(7, atoresFilme);
                System.out.println("Tamanho atores: "+atoresFilme.length());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOFilmeException("Falha na inserção", e);
        }
        if (resultado == 0) {
            throw new DAOFilmeException("Falha na inserção");
        }
    }

    @Override
    public List<Filme> buscarTodos() {
        List<Filme> filmes = new ArrayList<>();
        String sql = "select * from USUARIO.FILMES";
        try (Connection conexao = InicializadorBancoDados.conectarBd()) {
            try (Statement comando = conexao.createStatement()) {
                try (ResultSet resultado = comando.executeQuery(sql)) {
                    while (resultado.next()) {
                        String[] atoresFilmes = resultado.getString("atores").split("\n");
                        
                        Filme filme = new Filme(
                                resultado.getInt("id"),
                                resultado.getString("nome"),
                                resultado.getInt("anolancamento"),
                                resultado.getString("diretor"),
                                resultado.getString("sinopse"),
                                resultado.getString("cartaz"),
                                atoresFilmes);
                        filmes.add(filme);
                    }
                    return filmes;
                }
            }
        } catch (Exception e) {
            try {
                throw new DAOFilmeException("Falha na busca", e);
            } catch (DAOFilmeException ex) {
                Logger.getLogger(FilmeDAODerby.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
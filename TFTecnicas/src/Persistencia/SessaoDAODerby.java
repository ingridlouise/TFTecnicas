/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Negocio.DAOSessaoException;
import Negocio.Sessao;
import Negocio.SessaoDAO;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Generated;

/**
 *
 * @author ingridlouisepanizzirodrigues
 */

public class SessaoDAODerby implements SessaoDAO {
    public SessaoDAODerby(){
        
    }

    @Override
    public void addSessao(Sessao sessao) throws Exception{
       
        String sql = "insert into USUARIO.SESSOES (DIA, VAGAS, VALORINTEGRAL, IDSALA, IDHORARIO, IDFILME) values (?,?,?,?,?,?)";
        int resultado = 0;
        try (Connection conexao = InicializadorBancoDados.conectarBd()) {
            try (PreparedStatement comando = conexao.prepareStatement(sql)) {
                comando.setString(1, sessao.getDia());
                comando.setInt(2, sessao.getCapacidade());
                comando.setDouble(3, sessao.getValorIntegral());
                comando.setInt(4, sessao.getIdSala());
                comando.setInt(5, sessao.getIdHorario());
                comando.setInt(6, sessao.getIdFilme());
                resultado = comando.executeUpdate();
            }
        } catch (Exception e) {
            throw new DAOSessaoException("Falha na inserção", e);
        }
        if (resultado == 0) {
            throw new DAOSessaoException("Falha na inserção");
        }
    }
    
    @Override
    public List<Sessao> buscarTodas() {
        List<Sessao> sessoes = new ArrayList<>();
        String sql = "select * from USUARIO.SESSOES";
        try (Connection conexao = InicializadorBancoDados.conectarBd()) {
            try (Statement comando = conexao.createStatement()) {
                try (ResultSet resultado = comando.executeQuery(sql)) {
                    while (resultado.next()) {
                      
                        
                        Sessao sessao = new Sessao(
                        
                                resultado.getString("dia"),                                
                                resultado.getInt("vagas"),
                                resultado.getDouble("valorintegral"),
                                resultado.getInt("idsala"),
                                resultado.getInt("idhorario"),
                                resultado.getInt("idfilme")
                                );
                        sessoes.add(sessao);
                    }
                    return sessoes;
                }
            }
        } catch (Exception e) {
            try {
                throw new DAOSessaoException("Falha na busca", e);
            } catch (DAOSessaoException ex) {
                Logger.getLogger(FilmeDAODerby.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.DAOSalaException;
import Negocio.Sala;
import Negocio.SalaDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ingridlouisepanizzirodrigues
 */
public class SalaDAODerby implements SalaDAO {
    
    public SalaDAODerby(){
        
    }
    
    @Override
    public List<Sala> getSalas() {
        List<Sala> salas = new ArrayList<>();
        String sql = "select * from salas";
        try (Connection conexao = InicializadorBancoDados.conectarBd()) {
            try (Statement comando = conexao.createStatement()) {
                try (ResultSet resultado = comando.executeQuery(sql)) {
                    while (resultado.next()) {
                        Sala sala = new Sala(
                                resultado.getInt("capacidade"));
                        salas.add(sala);
                    }
                    return salas;
                }
            }
        } catch (Exception e) {
            try {
                throw new DAOSalaException("Falha na busca", e);
            } catch (DAOSalaException ex) {
                Logger.getLogger(SalaDAODerby.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
    
}

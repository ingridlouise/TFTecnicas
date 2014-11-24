/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.DAOHorarioException;
import Negocio.Horario;
import Negocio.HorarioDAO;
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
public class HorarioDAODerby implements HorarioDAO{

    public HorarioDAODerby() {
    }
    
    
     public List<Horario> getHorarios() {
        List<Horario> horarios = new ArrayList<>();
        String sql = "select * from USUARIO.HORARIOS";
        try (Connection conexao = InicializadorBancoDados.conectarBd()) {
            try (Statement comando = conexao.createStatement()) {
                try (ResultSet resultado = comando.executeQuery(sql)) {
                    while (resultado.next()) {
                        Horario horario = new Horario( resultado.getString("inicio"),
                                resultado.getString("fim"));
                        horarios.add(horario);
                    }
                    return horarios;
                }
            }
        } catch (Exception e) {
            try {
                throw new DAOHorarioException("Falha na busca", e);
            } catch (DAOHorarioException ex) {
                Logger.getLogger(SalaDAODerby.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}

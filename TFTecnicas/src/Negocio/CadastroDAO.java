/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.List;

/**
 *
 * @author Francielle
 */
public interface CadastroDAO {
    boolean adicionarFilme (Filme f) throws CadastroDAOException;
    Filme getFilmePorNome(String n) throws CadastroDAOException;
    List<Sala> getSalas() throws CadastroDAOException;
    List<Ingresso> getIngressos() throws CadastroDAOException;
    List<Cadeira> getCadeiras() throws CadastroDAOException;
    List<Horario> getHorarios() throws CadastroDAOException;
    List<Sessao> getSessoes() throws CadastroDAOException;
}

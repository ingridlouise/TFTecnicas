/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.List;

/**
 *
 * @author ingridlouisepanizzirodrigues
 */
public interface SessaoDAO {
    public void addSessao (Sessao sessao) throws Exception;
    public List<Sessao> buscarTodas();
}

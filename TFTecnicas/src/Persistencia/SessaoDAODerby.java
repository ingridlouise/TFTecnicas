/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.Sessao;
import Negocio.SessaoDAO;

/**
 *
 * @author ingridlouisepanizzirodrigues
 */

public class SessaoDAODerby implements SessaoDAO {
    public SessaoDAODerby(){
        
    }

    @Override
    public void addSessao(Sessao sessao) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
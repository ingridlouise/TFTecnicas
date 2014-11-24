/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Persistencia.SessaoDAODerby;
import java.util.List;

/**
 *
 * @author Francielle
 */
public class FachadaSessao {
private SessaoDAODerby sessao;

    
    
    public FachadaSessao() {
        sessao = new SessaoDAODerby();
    }
    
    public void addSessao(Sessao s) throws Exception{
        sessao.addSessao(s);
    }
    
    public List<Sessao> getSessoes() {
        List<Sessao> lista;
        lista = sessao.buscarTodas();
        return lista;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author ingridlouisepanizzirodrigues
 */
public class DAOSessaoException extends Exception{
    
    
    public DAOSessaoException(){
        super();
    }
    
    public DAOSessaoException(String mensagem) {
        super(mensagem);
    }
    
    public DAOSessaoException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
    
}

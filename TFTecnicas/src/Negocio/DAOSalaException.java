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
public class DAOSalaException extends Exception {
    public DAOSalaException(){
        super();
    }
    
    public DAOSalaException(String mensagem) {
        super(mensagem);
    }
    
    public DAOSalaException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}

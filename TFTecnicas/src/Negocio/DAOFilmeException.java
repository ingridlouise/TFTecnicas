/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Negocio;

/**
 *
 * @author Marcos
 */
public class DAOFilmeException extends Exception {
    public DAOFilmeException(){
        super();
    }
    
    public DAOFilmeException(String mensagem) {
        super(mensagem);
    }
    
    public DAOFilmeException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
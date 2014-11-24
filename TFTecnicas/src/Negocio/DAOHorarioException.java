/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Francielle
 */
public class DAOHorarioException extends Exception {
   public DAOHorarioException(){
        super();
    }
    
    public DAOHorarioException(String mensagem) {
        super(mensagem);
    }
    
    public DAOHorarioException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }  
}

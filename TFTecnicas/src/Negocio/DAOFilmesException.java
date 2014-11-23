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
public class DAOFilmesException extends Exception {
    public DAOFilmesException(){
        super();
    }
    
    public DAOFilmesException(String falha_na_busca, Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
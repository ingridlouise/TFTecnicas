/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Francielle
 */
public class Horario {
    private char inicio;
    private char fim;

    public Horario(char inicio, char fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public char getInicio() {
        return inicio;
    }

    public void setInicio(char inicio) {
        this.inicio = inicio;
    }

    public char getFim() {
        return fim;
    }

    public void setFim(char fim) {
        this.fim = fim;
    }

    @Override
    public String toString() {
        return "Horario{" + "inicio=" + inicio + ", fim=" + fim + '}';
    }
    
    
}

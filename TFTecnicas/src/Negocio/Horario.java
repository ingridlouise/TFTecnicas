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
    private String inicio;
    private String fim;

    public Horario(String inicio, String fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getInicio() {
        return ""+inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    @Override
    public String toString() {
        return "Horario{" + "inicio=" + inicio + ", fim=" + fim + '}';
    }
    
    
}

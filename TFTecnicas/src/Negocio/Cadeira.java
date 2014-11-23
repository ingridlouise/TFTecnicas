/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Francielle
 */
public class Cadeira {
    
    private Sala sala;
    private boolean disponivel = true;

    public Cadeira(Sala sala, boolean disponivel) {
        this.sala = sala;
        this.disponivel = disponivel;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Cadeira{" + "sala=" + sala + ", disponivel=" + disponivel + '}';
    }
    
    
    
}

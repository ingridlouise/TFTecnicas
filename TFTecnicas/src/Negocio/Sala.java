/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Francielle
 */
public class Sala {
    
    private int capacidade;
    private int id;

    public Sala(int id, int capacidade) {
        this.capacidade = capacidade;
        this.id = id;
    }

    public int getCapacidade() {
        return capacidade;
    }
    
    public int getId(){
        return id;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Sala{" + "capacidade=" + capacidade + '}';
    }
}
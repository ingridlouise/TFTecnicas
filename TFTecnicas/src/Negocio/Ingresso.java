/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Indy
 */
public class Ingresso {
    private double valorPago;
    private Sessao sessao;
    private Sala sala;
    private Cadeira cadeira;

    public Ingresso(double valor, Sessao sessao, Sala sala, Cadeira cadeira) {
        this.valorPago = valor;
        this.sessao = sessao;
        this.sala = sala;
        this.cadeira = cadeira;
    }

    public double getValor() {
        return valorPago;
    }

    public void setValor(double valor) {
        this.valorPago = valor;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Cadeira getCadeira() {
        return cadeira;
    }

    public void setCadeira(Cadeira cadeira) {
        this.cadeira = cadeira;
    }

    @Override
    public String toString() {
        return "Ingresso{" + "valor=" + valorPago + ", sessao=" + sessao + ", sala=" + sala + ", cadeira=" + cadeira + '}';
    }
    
    

   
    
    
}

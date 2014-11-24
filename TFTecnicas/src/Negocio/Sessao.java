/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.sql.Date;

/**
 *
 * @author Indy
 */
public class Sessao {

    
    private int capacidade;
    private int idFilme;
    private int idSala;
    private String dia;
    private int idHorario;
    private double valorIntegral;

    public Sessao( String dia, int capacidade, double valorIntegral, int idSala, int idHorario, int idFilme) {
      
        this.dia = dia;
        this.valorIntegral = valorIntegral;
        this.idSala = idSala;
        this.idHorario = idHorario;
        this.idFilme = idFilme;
        this.capacidade = capacidade;

    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

   

    

    public double getValorIntegral() {
        return valorIntegral;
    }

    public void setValorIntegral(double valorIntegral) {
        this.valorIntegral = valorIntegral;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    @Override
    public String toString() {
        return "Sessao{" + "capacidade=" + capacidade + ", idFilme=" + idFilme + ", idSala=" + idSala + ", dia=" + dia + ", idHorario=" + idHorario + ", valorIntegral=" + valorIntegral + '}';
    }

    

   
}
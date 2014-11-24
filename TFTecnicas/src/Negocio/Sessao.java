/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;

/**
 *
 * @author Indy
 */
public class Sessao {
    private Filme filme;
    private Sala sala;
    private Date dia;
    private Horario horario;
    private double valorIntegral;

    public Sessao(Filme filme, Sala sala, Date dia, Horario horario, double valorIntegral) {
        this.filme = filme;
        this.sala = sala;
        this.dia = dia;
        this.horario = horario;
        this.valorIntegral = valorIntegral;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public double getValorIntegral() {
        return valorIntegral;
    }

    public void setValorIntegral(double valorIntegral) {
        this.valorIntegral = valorIntegral;
    }

    @Override
    public String toString() {
        return "Sessao{" + "filme=" + filme + ", sala=" + sala + ", dia=" + dia + ", horario=" + horario + ", valorIntegral=" + valorIntegral + '}';
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.List;

/**
 *
 * @author Francielle
 */
public class Filme {
    private String nome;
    private long id;
    private int anoLancamento;
    private String diretor;
    private String sinopse;
    private String poster;
    private String[] atores;

    public Filme(long id, String nome, int anoLancamento, String diretor, String sinopse, String poster, String[] atores) {
        this.id = id;
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.sinopse = sinopse;
        this.poster = poster;
        this.atores = atores;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String[] getAtores() {
        return atores;
    }

    public void setAtores(String[] atores) {
        this.atores = atores;
    }

    @Override
    public String toString() {
        return "Filme{" + "nome=" + nome + ", anoLancamento=" + anoLancamento + ", diretor=" + diretor + ", sinopse=" + sinopse + ", poster=" + poster + ", atores=" + atores + '}';
    }
    
    
}

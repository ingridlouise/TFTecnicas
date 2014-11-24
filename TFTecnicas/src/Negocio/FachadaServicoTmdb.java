package Negocio;

import Persistencia.FilmeDAODerby;
import com.omertron.themoviedbapi.MovieDbException;
import com.omertron.themoviedbapi.TheMovieDbApi;
import com.omertron.themoviedbapi.model.MovieDb;
import com.omertron.themoviedbapi.model.Person;
import com.omertron.themoviedbapi.results.TmdbResultsList;
import java.util.List;

public class FachadaServicoTmdb {

    private String chaveAcesso;
    private TheMovieDbApi tmdb;
    private FilmeDAODerby filme;

    public FachadaServicoTmdb(String chaveAcesso) throws FachadaServicoTmdbException {
        this.chaveAcesso = chaveAcesso;
        filme = new FilmeDAODerby();
        try {
            tmdb = new TheMovieDbApi(chaveAcesso);
        } catch (MovieDbException ex) {
            throw new FachadaServicoTmdbException("Erro de inicialização da fachada de acesso ao TMDB;", ex);
        }
    }

    public List<MovieDb> buscarFilmesPorNome(String nome) throws FachadaServicoTmdbException {
        try {
            TmdbResultsList<MovieDb> filmes = tmdb.searchMovie(nome, 0, "", true, 0);
            return filmes.getResults();
        } catch (MovieDbException ex) {
            throw new FachadaServicoTmdbException("Falha na busca por filmes.", ex);
        }
    }

    public List<Person> getAtores(int idFilme) throws MovieDbException {
        TmdbResultsList<Person> lista;
        lista = tmdb.getMovieCasts(idFilme, (String) null);
        return lista.getResults();
    }

    public void addFilme(Filme filmeSelecionado) throws Exception {
        filme.addFilme(filmeSelecionado);
    }

    public List<Filme> getFilmes() {
        List<Filme> lista;
        lista = filme.buscarTodos();
        return lista;
    }
}

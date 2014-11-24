/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Negocio.Filme;
import com.omertron.themoviedbapi.model.MovieDb;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author ingridlouisepanizzirodrigues
 */
public class MyComboModelMovieDB implements ComboBoxModel<String> {
    List<MovieDb> comboFilmes;
    String itemSelecionado;
    
    public MyComboModelMovieDB (List<MovieDb> lista) {
        comboFilmes = lista;
        itemSelecionado = lista.get(0).getTitle();
    }
    
    public MovieDb getInfosFilme (int index){
        return comboFilmes.get(index);
    }
    
    @Override
    public void setSelectedItem(Object anItem) {
        itemSelecionado = anItem.toString();
    }

    @Override
    public Object getSelectedItem() {
        return itemSelecionado;
    }

    @Override
    public int getSize() {
        return comboFilmes.size();
    }

    @Override
    public String getElementAt(int index) {
        return comboFilmes.get(index).getTitle();
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }   
}
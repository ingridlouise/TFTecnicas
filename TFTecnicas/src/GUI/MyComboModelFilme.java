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
public class MyComboModelFilme implements ComboBoxModel<String> {
    List<Filme> comboFilmes;
    String itemSelecionado;
    
    public MyComboModelFilme (List<Filme> lista) {
        comboFilmes = lista;
        itemSelecionado = lista.get(0).getNome();
    }
    
    public Filme getInfosFilme (int index){
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
        return comboFilmes.get(index).getNome();
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }   
}
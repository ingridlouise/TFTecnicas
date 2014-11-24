/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Negocio.Sala;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author ingridlouisepanizzirodrigues
 */
public class MyComboModelSalas implements ComboBoxModel<String> {
    List<Sala> comboSalas;
    String itemSelecionado;
    
    public MyComboModelSalas (List<Sala> lista) {
        comboSalas = lista;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(lista.get(0).getCapacidade());
        String strI = sb.toString();        
        itemSelecionado = strI;
    }
    
    public Sala getInfosSala (int index){
        return comboSalas.get(index);
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
        return comboSalas.size();
    }

    @Override
    public String getElementAt(int index) {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(comboSalas.get(index).getCapacidade());
        String strI = sb.toString();
        return strI;
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }   
}
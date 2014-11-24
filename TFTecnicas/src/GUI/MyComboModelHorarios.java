/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Negocio.Horario;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author ingridlouisepanizzirodrigues
 */
public class MyComboModelHorarios implements ComboBoxModel<String> {
     List<Horario> comboHorarios;
    String itemSelecionado;
    
    public MyComboModelHorarios (List<Horario> lista) {
        comboHorarios = lista;
        itemSelecionado = "" +lista.get(0).getInicio() + "-" + lista.get(0).getFim();
    }
    
    public Horario getInfosHorario (int index){
        return comboHorarios.get(index);
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
        return comboHorarios.size();
    }

    @Override
    public String getElementAt(int index) {
        return ""+comboHorarios.get(index).getInicio()+"-"+comboHorarios.get(index).getFim();
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }   
}

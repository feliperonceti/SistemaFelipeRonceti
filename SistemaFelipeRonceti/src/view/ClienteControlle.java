/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteFgv;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Felipe Ronceti
 */


public class ClienteControlle extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        
    }
    
    public ClienteFgv getBean(int linha) {
        return (ClienteFgv) lista.get(linha);
           
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        ClienteFgv usuario = (ClienteFgv) lista.get(rowIndex);
        
        if (columnIndex == 0) {
       
            return usuario.getIdclienteFgv();
        }
        if (columnIndex == 1) {
            return usuario.getNomeFgv();
        }
        if (columnIndex == 2) {
            return usuario.getCpfFgv();
        }
        if (columnIndex == 3) {
            return usuario.getRgFgv();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "ID";
        }
        if (columnIndex == 1) {
            return "Nome";
        }
        if (columnIndex == 2) {
            return "Cpf";
        }
        if (columnIndex == 3) {
            return "Rg";
        }
        return "";
    }
}

    



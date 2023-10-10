/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.UsuarioFgv;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Felipe Ronceti
 */


public class UsuarioControlle extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        
    }
    
    public UsuarioFgv getBean(int linha) {
        return (UsuarioFgv) lista.get(linha);
           
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
        
        UsuarioFgv usuario = (UsuarioFgv) lista.get(rowIndex);
        
        if (columnIndex == 0) {
       
            return usuario.getIdusuarioFgv();
        }
        if (columnIndex == 1) {
            return usuario.getNomeFgv();
        }
        if (columnIndex == 2) {
            return usuario.getApelidoFgv();
        }
        if (columnIndex == 3) {
            return usuario.getCpfFgv();
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
            return "Apelido";
        }
        if (columnIndex == 3) {
            return "CPF";
        }
        return "";
    }
}

    



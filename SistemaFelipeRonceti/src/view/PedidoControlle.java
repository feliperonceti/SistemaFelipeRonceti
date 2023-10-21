/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.PedidoFgv;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Felipe Ronceti
 */


public class PedidoControlle extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        
    }
    
    public PedidoFgv getBean(int linha) {
        return (PedidoFgv) lista.get(linha);
           
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        PedidoFgv usuario = (PedidoFgv) lista.get(rowIndex);
        
        if (columnIndex == 0) {
       
            return usuario.getIdpedidoFgv();
        }
        if (columnIndex == 1) {
            return usuario.getNomeclienteFgv();
        }
        if (columnIndex == 2) {
            return usuario.getEnderecoentregaFgv();
        }
        if (columnIndex == 3) {
            return usuario.getModelotelefoneFgv();
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
            return "Endereco";
        }
        if (columnIndex == 3) {
            return "Modelo";
        }
        return "";
    }
}

    



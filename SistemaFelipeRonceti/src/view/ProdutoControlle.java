/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ProdutoFgv;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Felipe Ronceti
 */


public class ProdutoControlle extends AbstractTableModel{
     private List lista;
    
    public void setList(List lista) {
        this.lista = lista;
        
    }
    
    public ProdutoFgv getBean(int linha) {
        return (ProdutoFgv) lista.get(linha);
           
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
        
        ProdutoFgv produto = (ProdutoFgv) lista.get(rowIndex);
        
        if (columnIndex == 0) {
       
            return produto.getIdprodutoFgv();
        }
        if (columnIndex == 1) {
            return produto.getNomeFgv();
        }
        if (columnIndex == 2) {
            return produto.getMarcaFgv();
        }
        if (columnIndex == 3) {
            return produto.getCorFgv();
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
            return "Marca";
        }
        if (columnIndex == 3) {
            return "Cor";
        }
        return "";
    }

  
}

    



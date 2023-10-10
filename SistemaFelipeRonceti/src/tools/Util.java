/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Felipe Ronceti
 */

public class Util {
   
     public static void habilitar(boolean valor, JComponent ... vetComp){
        for (int i = 0; i < vetComp.length; i++){
            vetComp[i].setEnabled(valor);
        }
   
     }
     
     public static void limparCampos(JComponent ... vetComp) {
         for (JComponent componente : vetComp) {
             if (componente instanceof JTextField){
             ((JTextField) componente).setText("");
         }
              if (componente instanceof JComboBox){
                  ((JComboBox) componente).setSelectedIndex(-1);
              }
                 if (componente instanceof JComboBox){
                  ((JComboBox) componente).setSelectedIndex(-1);
              }
              if (componente instanceof JCheckBox){
                  ((JCheckBox) componente).setSelected(false);
              }
         }
     }
     
     
     public static void mensagem(String cadeia){
           JOptionPane.showMessageDialog(null, cadeia);
     }
     
     public static boolean perguntar (String cadeia){
          int resp = JOptionPane.showConfirmDialog(null, cadeia, "Perguntar", JOptionPane.YES_NO_OPTION);
          return resp == JOptionPane.YES_OPTION;
           
     }
       
     
     public static int strInt(String cad){
           return Integer.valueOf(cad);
     }
     
     public static String intStr(int num){
           return String.valueOf(num);
     }
     
      public static String doubleStr(double num){
           return String.valueOf(num);
     }
      
     public static double strDouble(String cad){
           return Integer.valueOf(cad);
     }
      
       public static Date strDate(String cad){
           SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
           try {
               return formato.parse(cad);
           
           } catch (ParseException ex){
               Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
           }
           return null;
     }
       
        public static String dateStr (Date num){
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
           return formato.format(num);
     }
     
}




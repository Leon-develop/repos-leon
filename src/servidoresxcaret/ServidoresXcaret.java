/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoresxcaret;


import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author heriberto guzman
 */
public class ServidoresXcaret extends DefaultTableCellRenderer{
   
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if(value instanceof JButton){
     JButton btn=(JButton)value;
     JButton btn2=(JButton)value;
     JButton btn3=(JButton)value;
     JButton btn4=(JButton)value;
     return btn;
 }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }
   
    

}
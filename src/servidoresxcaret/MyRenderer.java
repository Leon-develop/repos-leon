/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoresxcaret;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Leo González
 */
public class MyRenderer extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable table,
            Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if (isSelected) {
            this.setBackground(Color.black);
            this.setForeground(Color.white);
        } else {
            this.setBackground(Color.white);
            this.setForeground(Color.black);
        }
        return this;
    }
    
}

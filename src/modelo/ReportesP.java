/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import servidoresxcaret.ServidoresXcaret;


/**
 *
 * @author heriberto guzman
 */
public class ReportesP {
    public void ver(JTable table){
     table.setDefaultRenderer(Object.class, new ServidoresXcaret());
                   JButton btn =new JButton("Consultar"); 
                   JButton btn2 =new JButton("Consultar");
                   JButton btn3 =new JButton("Consultar"); 
                   JButton btn4 =new JButton("Consultar"); 
            btn.setName("1");
            btn2.setName("2");
            btn3.setName("3");
            btn4.setName("4");
            DefaultTableModel d= new DefaultTableModel(
                    new Object[][]{{ "Reporte por unidada de negocio",btn},{"Reporte en todo los servidores",btn2},{"Reporte por tipo de servidores",btn3},{"Reporte por Estado de servidores",btn4}},
                    new Object[]{"Descripción de los reportes",""}
                   
      
            ){
            public boolean isCellEditable(int row,int column){
                return true;
}    
            };
            table.setModel(d);
            table.setRowHeight(30);
           /*
            btn2.setBackground( new Color(91,178,147) );
            btn2.setFont(new Font("Arial", Font.PLAIN, 12));
            btn2.setBorder(null);
            btn2.setOpaque(true);
            btn2.setContentAreaFilled(true);*/
        
        JTableHeader header=  table.getTableHeader();
           header.setBackground(Color.green);
           header.setForeground(Color.green);
             header.setOpaque(true);
}}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author sns5408
 */
    public class JFrameOne extends JFrame {
          
      public JFrameOne()
          {
              super();
        JFrame f = new JFrame("djsnfjkds");
        JPanelOne w = new JPanelOne();
      
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200,700);
        f.setResizable(false); 
        f.add(w);
          }
        
       
       public class JPanelOne extends JPanel {
       
        JPanel pane = new JPanel();
        private JTextArea b;
        
       JPanelOne(){
        b= new JTextArea("blah");
        
        pane.add(b); 
        }
        
    }
    
}

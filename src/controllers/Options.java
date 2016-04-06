/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author aot5238 and lmo5113
 *
 */
public class Options extends JFrame
{     
//     int panelWidth;
//     int panelHeight;
     private boolean pauseOption = false; 
     private JButton start; 
     private JButton pause; 
     JFrame frame = new JFrame("Frame");
     
    public Options()
    {
        super();        
//        frame.setSize((panelWidth * (1 / 10)), panelHeight);
        frame.setSize(new Dimension(800,600));        
        frame.setBackground(Color.GREEN);
        frame.setLayout(new GridBagLayout());
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public void addComponents(){
        start = new JButton("Start");
        pause = new JButton("Pause");
        
        add(start);
        add(pause);
    }
    
    public void setStart(JButton start) {
        this.start = start;
    }
    
     public JButton getStart() {
        return start;
    }
    
      public void setPauseOption(JButton pause) {
        this.pauseOption = pauseOption; 
    }
      
       public boolean getPauseOption() {
        return pauseOption;
    }

    public void setSize(int i, int panelHeight) {
        //throw new UnsupportedOperationException(); 
    }
  
    public void setPreferredSize(Dimension dimension) {
        //throw new UnsupportedOperationException(" "); 
    }

    public void setBackground(Color GREEN) {
        //throw new UnsupportedOperationException(""); 
    }

    private void setLayout(GridBagLayout gridBagLayout) {
        //throw new UnsupportedOperationException(); 
                }

}

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
import javax.swing.JPanel;

/**
 *
 * @author aot5238 and lmo5113
 *
 */
public final class Options extends JPanel
{
     
     int panelWidth;
     int panelHeight;
     private boolean pauseOption = false; 
     private JButton start; 
     private JButton pause; 
    
    public Options(int panelWidth, int panelHeight)
    {
        super();
        setSize((panelWidth * (1 / 10)), panelHeight);
        setPreferredSize(new Dimension(300, 450));
        setBackground(Color.GREEN);
        setLayout(new GridBagLayout());

    }
    
    public void addComponents(){
        start = new JButton("Start");
        pause = new JButton("Pause");
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

    @Override
    public void setSize(int i, int panelHeight) {
        throw new UnsupportedOperationException(); 
    }
  
    @Override
    public void setPreferredSize(Dimension dimension) {
        throw new UnsupportedOperationException(" "); 
    }

    @Override
    public void setBackground(Color GREEN) {
        throw new UnsupportedOperationException(""); 
    }

    private void setLayout(GridBagLayout gridBagLayout) {
        throw new UnsupportedOperationException(); 
                }

}

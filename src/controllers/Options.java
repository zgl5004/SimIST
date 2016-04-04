/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JPanel;

/**
 *
 * @author aot5238
 */
public final class Options extends JPanel
{
    
    public Options(int panelWidth, int panelHeight)
    {
        super();
        setSize((panelWidth * (1 / 10)), panelHeight);
        setPreferredSize(new Dimension(300, 450));
        setBackground(Color.GREEN);
        setLayout(new GridBagLayout());

    }

    @Override
    public void setSize(int i, int panelHeight) {
        throw new UnsupportedOperationException(); 
    }

  
    @Override
    public void setPreferredSize(Dimension dimension) {
        throw new UnsupportedOperationException(""); 
    }

    @Override
    public void setBackground(Color GREEN) {
        throw new UnsupportedOperationException(""); 
    }

    private void setLayout(GridBagLayout gridBagLayout) {
        throw new UnsupportedOperationException(); 
                }
    
}

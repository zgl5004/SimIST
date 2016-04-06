package controllers;

import javax.swing.JFrame;
import views.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrimland
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameFrame frame1 = new GameFrame("Frame");
        frame1.setVisible(true);
       Floor Floor1 = new Floor("Floor 1"); 
       Floor1.setVisible(true);
        frame1.add(Floor1);
        frame1.revalidate();
        frame1.repaint();
    }
    
}

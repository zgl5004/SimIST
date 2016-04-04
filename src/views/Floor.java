/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author matthewtucker
 */
public class Floor extends JPanel implements ActionListener {
   private String floorName;
   private Image floorImage;
   private Timer refreshTimer;
   
   public Floor(String floorName, Image floorImage){
       refreshTimer = new Timer (750, this);
       refreshTimer.start();
       this.floorName = floorName;
       this.floorImage = floorImage;
   }
   
   
   public String getFloorName(){
       return this.floorName;
   }
   
   public void setFloorName(String name){
       this.floorName = name;
   }
   
   public void setImage (Image newImage){
       this.floorImage = newImage;
   }
   
   public void paintComponent(Graphics g){
       
   }
   
   public void actionPerformed(ActionEvent e){
       Object o = e.getSource();
       
       if(o == refreshTimer){
           this.repaint();
       }
   }
}

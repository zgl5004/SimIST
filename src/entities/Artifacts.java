/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import javafx.scene.image.Image;
import javax.swing.*;

/**
 *
 * @author sns5408
 */
public class Artifacts extends Rectangle {
    
   private String ArtifactMaterial; 
   public String ArtifactType;
   
   public boolean isUsable;
   public boolean isEditable; 
   public boolean isCollidable; 
   
   public int xLocation;
   public int yLocation; 
  
   ArrayList <Image> artifacts;  
   
  Artifacts(String ArtifactMaterial, String ArtifactType,boolean isUsable,boolean isEditable, boolean isCollidable, int xLocation, int yLocation)
   {
       this.ArtifactMaterial=ArtifactMaterial; 
       this.ArtifactType=ArtifactType;
       this.isUsable=isUsable; 
       this.isEditable = isEditable;
       this.isCollidable=isCollidable;
       this.xLocation=xLocation;
       this.yLocation=yLocation; 
   }
   
    
    public void paintComponent(Graphics g){
        paintComponent(g);
        
        
    }
            
 public void getArtifactInfo(){
        //return Type of Artifact ie: chair, computer, painting, plant, table, etc. 
    }
    
    public void getImage(){
        //return image
        
    }
   /* public void getLocation(){
        //return location
    }
*/
    /**
     * @return the ArtifactMaterial
     */
    public String getArtifactMaterial() {
        return ArtifactMaterial;
    }

 
    public class Furniture extends Artifacts{
        String FurnitureType;
        String FurnitureDescription;
        
        Furniture(String ArtifactMaterial, String ArtifactType,boolean isUsable,boolean isEditable, boolean isCollidable, int xLocation, int yLocation, String FurnitureName){
            super(ArtifactMaterial,ArtifactType,isUsable,isEditable,isCollidable,xLocation,yLocation);
            this.FurnitureType = FurnitureType;
            
            
            
        }
            
            
            
        }
    
}
 
      
    
    
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;
import javafx.scene.image.Image;

/**
 *
 * @author sns5408
 */
public class Artifacts {
    
   public String ArtifactMaterial; 
   public String ArtifactType;
   
   public boolean isUsable;
   public boolean isEditable; 
   public boolean isCollidable; 
   
   public int xLocation;
   public int yLocation; 
  
   ArrayList <Image> artifacts;  
   
    
    
            
 public void getArtifactType(){
        //return Type of Artifact ie: chair, computer, painting, plant, table, etc. 
    }
    
    public void getImage(){
        //return image
    }
    public void getLocation(){
        //return location
    }
    
 
    
    
    
    
    
}

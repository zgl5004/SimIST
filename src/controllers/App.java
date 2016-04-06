package controllers;

import entities.Player;
import entities.Professor;
import entities.Student;
import java.util.ArrayList;
import javafx.scene.shape.Circle;

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
        Student student = new Student();
        student.printAttributes();
        
        Player player = new Player();
        player.printAttributes();
        
        Professor professor = new Professor();
        professor.printAttributes();
        
        //playerShots.add(new Circle(x, y+playerRadius/4, shotRadius));
        
        ArrayList<Student> studentList;
        studentList = new ArrayList<>();
        
        ArrayList<Professor> professorList;
        professorList = new ArrayList<>();
        
        //creates 100 students and creates 20 professors
        for(int i = 0; i < 100; i++){
            studentList.add(new Student());
        }
        
        for(int i = 0; i < 20; i++){
            professorList.add(new Professor());
        }
        
    }
    
}

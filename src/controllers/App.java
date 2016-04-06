package controllers;

import java.text.ParseException;
import sandbox.Clock;
import sandbox.ISTTime;

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
    public static void main(String[] args) throws ParseException {
        Clock c = new Clock();
        ISTTime t = new ISTTime();
        System.out.println(t.getTime());
    }
    
}

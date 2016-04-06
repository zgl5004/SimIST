package controllers;

import java.text.ParseException;
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
        ISTTime t = new ISTTime();
        t.getTime();
    }
    
}

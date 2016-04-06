package controllers;
import java.net.*;
import java.io.*;
import java.util.*;
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
    public static void main(String[] args) throws Exception {
        {
        String[] weatherSite;
        URL weather = new URL("http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2499253/");
        URLConnection yc = weather.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                    yc.getInputStream()));
        String inputLine;
        
        while (((inputLine = in.readLine()))!= null) {
            System.out.println(inputLine);
            
            
            
        in.close();
        }
        
       
        } 

    }
}


package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.jsoup.*;
import java.io.File;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.*;
/**
 *
 * @author jrimland
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File istSchedule = new File("src/controllers/ISTschedule.htm");
        try {
            Document doc = Jsoup.parse(istSchedule, "UTF-8", "");
            Element partOfSchedule = doc.select("").first();
            String schedule = partOfSchedule.toString();
            System.out.print(schedule);
        }catch (Exception error){
            
        }
    }
    
}

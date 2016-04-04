/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sandbox;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author aah5307
 */
public class Time {
    
    LocalDate date;
    
    public Time(LocalDate date){
        this.date = date;
    }
    
    
    public DayOfWeek getDayOfWeek(){
        return date.getDayOfWeek();
    }
    
    public void setDate(LocalDate newDate){
        this.date = newDate;
    }
    
    public String showDate(){
        return date.getDayOfMonth() + " " + date.getMonth() + "" + date.getYear();
    }
}

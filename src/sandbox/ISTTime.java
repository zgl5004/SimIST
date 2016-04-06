/*
Time currently runs like this.
current time, which is the system time at the moment the program is run, is turned into the string rightNow by being formatted in the format of a SimpleDateFormat.
rightNow can be modified by a String called newCurrentTime, which is handled by Clock. setCurrentTime basically makes rightNow = newCurrentTime, so as to simulate the progression of time.

It's kinda simple, and never ends, but I guess it works.
-Max
 */
package sandbox;

import java.text.ParseException;
import java.time.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author aah5307
 */
public class ISTTime {
    String gameStartTime;
    String rightNow;
    
    public ISTTime() throws ParseException{
        gameStartTime = ("8:00");
    }
    
    public String getTime(){
      return this.gameStartTime;
    }
    public void setCurrentTime(String newCurrentTime){
        this.rightNow = newCurrentTime;
    }
/*    
    public void setDate(LocalDate newDate){
        //this.date = newDate;
    }
    
    public String showDate(){
        //return date.getDayOfMonth() + " " + date.getMonth() + "" + date.getYear();

    }
*/  
}

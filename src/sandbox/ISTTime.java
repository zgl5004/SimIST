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
    
    SimpleDateFormat format;
    Date currentTime;
    Date beginTime;
    Date endTime;
    String rightNow;
    Calendar c;
    
    public ISTTime() throws ParseException{
        format = new SimpleDateFormat("HH:mm");
        //ignore beginTime for now, I think it's useful, but not sure what I can do with it. - Max
        //beginTime = format.parse("8:00");
        //Ignore endTime for now, currently the simulation runs forever. I find that it reflects college life wonderfully. - Max
        //endTime = format.parse("0:00");        
        rightNow = format.format(currentTime);
    }
    
    public String getTime(){
      return this.rightNow;
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

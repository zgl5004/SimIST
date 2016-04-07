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


/**
 *
 * @author aah5307
 */
public class ISTTime {
    LocalDateTime now;
    

    public ISTTime() throws ParseException{
        this.now = LocalDateTime.of(2016,4,1,8,0);
    }
    
    public LocalTime getTime(){
      return now.toLocalTime();
    }
    
    public LocalDate getDate(){
        return now.toLocalDate();
    }
    
    public void setTime(int hour){
        now = now.withHour(hour);
    }
    
    public void setDate(LocalDate newDate){
        now = newDate.atTime(getTime());
    }
    
    public String showDate(){
        return now.getDayOfMonth() + " " + now.getMonth() + "" + now.getYear();
    }
    
    public String showTime(){
        return now.getHour() + " : " + now.getMinute();
    }
    
}

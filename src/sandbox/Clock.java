/*
Writing this in a hurry, sorry if vague.
Clock creates a timer, that ticks down every 60 seconds, or 60000 milliseconds.
Then it increments time and creates it as a new currentTime.
I guess that works.
-Max
 */
package sandbox;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author aahughes
 */
public class Clock{
    LocalTime currentTime;
    LocalTime endTime;
    ISTTime time;
    Timer progressionOfTime;
    TimerTask task;
    int speed;
    int hours;
    
    public Clock() throws ParseException{
        
        progressionOfTime = new Timer();
        endTime = LocalTime.of(00,00);
        speed = 1;
        currentTime = time.getTime();        
        task = new TimerTask(){
            @Override
            public void run(){ 
                
               if(speed == 0){
                   hours = 0;
                   time.setTime(hours);
               }else if(speed == 1){
                   hours = 1;
                   System.out.println(currentTime);
               }else if(speed == 2){
                   hours = 2;
                   time.setTime(hours);
               }else if (speed == 3){
                   hours = 3;
                   time.setTime(hours);
               }

            }
            
        };           
    }
    
    public void startTimer(){
        progressionOfTime.scheduleAtFixedRate(task, 1000,1000);
    }

    }


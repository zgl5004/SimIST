/*
Clock creates a timer that ticks down every 60 seconds, or 60000 milliseconds.
Then it increments time by the amount in speed and changes the ISTTime "time".

It currently then prints the time and date to show it has changed.
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
 * @author aahughes, maxwellkos
 */
public class Clock{
    LocalTime endTime;
    ISTTime time;
    Timer progressionOfTime;
    TimerTask task;
    int speed;
    int hours;
    
    public Clock() throws ParseException{
        
        time = new ISTTime();
        progressionOfTime = new Timer();
        endTime = LocalTime.of(00,00);
        speed = 1;
        task = new TimerTask(){
            @Override
            public void run(){ 
                
               if(speed == 0){
                   hours = 0;
                   time.setTime(hours);
               }else if(speed == 1){
                   hours = 1;
                   time.setTime(hours);
               }else if(speed == 2){
                   hours = 2;
                   time.setTime(hours);
               }else if (speed == 3){
                   hours = 3;
                   time.setTime(hours);
               }
             
               System.out.println(time.showTime() + "    " + time.showDate());
            }
        };           
    }
    
    public void startTimer(){
        progressionOfTime.scheduleAtFixedRate(task, 1000, 60000);
    }

    }


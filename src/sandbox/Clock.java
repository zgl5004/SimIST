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
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author aahughes
 */
public class Clock{
    SimpleDateFormat format;
    Date beginTime;
    Date endTime;    
    ISTTime time;
    Timer progressionOfTime;
    TimerTask task;
    int incrementTime;
    String newCurrentTime;
    int speed;
    
    public Clock() throws ParseException{
        progressionOfTime = new Timer();
        task = new TimerTask(){
            @Override
            public void run(){
               System.out.println("DONGERS ARE RAISED");
            }
        };
        format = new SimpleDateFormat("HH:mm");
        beginTime = format.parse("8:00");
        endTime = format.parse("0:00");             
        //incrementTime = Integer.parseInt(time.getTime());
    }
    
    public void startTimer(){
        progressionOfTime.scheduleAtFixedRate(task, 1000,1000);
    }


}

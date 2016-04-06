/*
Writing this in a hurry, sorry if vague.
Clock creates a timer, that ticks down every 60 seconds, or 60000 milliseconds.
Then it increments time and creates it as a new currentTime.
I guess that works.
-Max
 */
package sandbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.Timer;


/**
 *
 * @author aahughes
 */
public class Clock implements ActionListener {
    SimpleDateFormat format;
    Date beginTime;
    Date endTime;    
    ISTTime time;
    Timer progessionOfTime;
    int incrementTime;
    String newCurrentTime;
    
    public Clock() throws ParseException{
        format = new SimpleDateFormat("HH:mm");
        beginTime = format.parse("8:00");
        endTime = format.parse("0:00");             
        progessionOfTime = new Timer(60000,this);
        //incrementTime = 
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        incrementTime = incrementTime +1;
        newCurrentTime = Integer.toString(incrementTime);
        time.setCurrentTime(newCurrentTime);
    }
}

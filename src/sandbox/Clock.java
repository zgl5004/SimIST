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
import java.time.DayOfWeek;
import java.time.LocalDate;
import javax.swing.Timer;


/**
 *
 * @author aahughes
 */
public class Clock implements ActionListener {
    ISTTime time;
    Timer progessionOfTime;
    int incrementTime;
    String newCurrentTime;
    
    public Clock(){
        progessionOfTime = new Timer(60000,this);
        incrementTime = Integer.parseInt(time.getTime());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        incrementTime = incrementTime +1;
        newCurrentTime = Integer.toString(incrementTime);
        time.setCurrentTime(newCurrentTime);
    }
}

package ca.ualberta.cs.lonelytwitter;

/**
 * Created by a123456 on 2018-01-18.
 */
import java.util.Date;

public abstract class mood {
    private Date date;

    public mood(){
        this.date = new Date(); //set to default

    }
    public mood(Date date){
        this.date = date;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public abstract String currentMood();
    public abstract Boolean isHappy();

}

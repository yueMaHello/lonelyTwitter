package ca.ualberta.cs.lonelytwitter;

/**
 * Created by a123456 on 2018-01-18.
 */
import java.util.Date;

public abstract class mood {
    private Date date;
    private String currentMood;

    public mood(String currentMood){
        this.date = new Date(); //set to default
        this.currentMood = currentMood;
    }
    public mood(Date date,String currentMood){
        this.date = date;
        this.currentMood = currentMood;
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public abstract String representMood();
    public abstract Boolean isHappy();

}

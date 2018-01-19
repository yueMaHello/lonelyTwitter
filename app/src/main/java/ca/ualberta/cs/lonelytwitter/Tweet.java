package ca.ualberta.cs.lonelytwitter;

/**
 * Created by a123456 on 2018-01-18.
 */
import java.util.ArrayList;
import java.util.Date;
public abstract class Tweet implements Tweetable {

    private String message;

    private Date date;

    public Tweet(String message){
        this.message = message; //please always use "this" keyword

    }
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;

    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length()>140){
            throw new TweetTooLongException();
        }
        else{
            this.message = message;
        }
    }
    public abstract Boolean isImportant();

    mood happy = new moodHappy();
    mood sad = new moodSad();
    ArrayList<mood> moodList = new ArrayList<mood>();

    void mood_add() {
        moodList.add(happy);
        moodList.add(sad);
    }
}

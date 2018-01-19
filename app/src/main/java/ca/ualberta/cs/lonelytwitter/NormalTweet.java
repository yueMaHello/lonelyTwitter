package ca.ualberta.cs.lonelytwitter;

/**
 * Created by a123456 on 2018-01-18.
 */
import java.util.Date;

public class NormalTweet extends Tweet {
    public NormalTweet(String message){
        super(message);

    }
    public NormalTweet(String message,Date date){
        super(message,date);
    }
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}

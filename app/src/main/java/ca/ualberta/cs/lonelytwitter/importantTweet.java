package ca.ualberta.cs.lonelytwitter;

/**
 * Created by a123456 on 2018-01-18.
 */
import java.util.Date;
//everything else is the same as the parents, except 'isImportant'
public class importantTweet extends Tweet {
    public importantTweet(String message){
        super(message);
    }
    public importantTweet(String message,Date date){
        super(message,date);
    }
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}

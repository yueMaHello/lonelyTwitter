package ca.ualberta.cs.lonelytwitter;

import java.util.Date;
/**
 * Created by a123456 on 2018-01-18.
 */
        import java.util.Date;

public class moodSad extends mood {
    public moodSad(){
        super();
    }
    public moodSad(Date date){
        super(date);
    }
    public String currentMood(){
        return "Sad";
    }
    public Boolean isHappy() {
        return Boolean.FALSE;
    }

}
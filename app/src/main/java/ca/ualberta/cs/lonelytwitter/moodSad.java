package ca.ualberta.cs.lonelytwitter;

/**
 * Created by a123456 on 2018-01-18.
 */

import java.util.Date;
/**
 * Created by a123456 on 2018-01-18.
 */
        import java.util.Date;

public class moodSad extends mood {
    //private String moodMessage;
    public moodSad(String currentMood){
        super(currentMood );
    }
    public moodSad(Date date,String currentMood){
        super(date,currentMood);
    }
    public String representMood(){
        return "Sad";
    }
    public Boolean isHappy() {
        return Boolean.FALSE;
    }

}
package ca.ualberta.cs.lonelytwitter;

/**
 * Created by a123456 on 2018-01-18.
 */


import java.util.Date;

public class moodHappy extends mood {
    //private String moodMessage;
    public moodHappy(String currentMood){
        super(currentMood);
    }
    public moodHappy(Date date,String currentMood){
        super(date,currentMood);
    }
    public String representMood(){
        return "Happy";
    }
    public Boolean isHappy() {
        return Boolean.TRUE;
    }

}
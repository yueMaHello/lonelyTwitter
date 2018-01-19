package ca.ualberta.cs.lonelytwitter;

/**
 * Created by a123456 on 2018-01-18.
 */


import java.util.Date;

public class moodHappy extends mood {
    public moodHappy(){
        super();
    }
    public moodHappy(Date date){
        super(date);
    }
    public String currentMood(){
        return "Happy";
    }
    public Boolean isHappy() {
        return Boolean.TRUE;
    }

}
/*
 * Copyright (c)2018 Team X, CMPUT301. University of Alberta - All Rights Reserved.
 * You may use, distribute or modify this code under terms and conditions of Code of
 * Student Behaviour at U of A. You can find a copy of the license in this project. Otherwise
 * please contact ym5@ualberta.ca
 * /
 */

package ca.ualberta.cs.lonelytwitter;
/**
 * Represents a tweet
 * @author: Yue Ma
 * @version: 1.0
 */
import java.util.Date;

public class ImportantTweet extends Tweet {
    /**
     * construct using the super class's construction
     * @param message -- the message of tweet
     */
    ImportantTweet(String message){
        super(message);
    }

    ImportantTweet(String message, Date date){
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}

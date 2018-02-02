/*
 * Copyright (c)2018 Team X, CMPUT301. University of Alberta - All Rights Reserved.
 * You may use, distribute or modify this code under terms and conditions of Code of
 * Student Behaviour at U of A. You can find a copy of the license in this project. Otherwise
 * please contact ym5@ualberta.ca
 * /
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet
 * @author: Yue Ma
 * @version: 1.0
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    /**
     * Constructs a tweet instance using the given message
     *
     * @param message the message of the tweet
     */

    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * get the messages of the tweet
     *
     * @return
     */
    public String getMessage(){
        return message;
    }

    /**
     * sets the message of the tweet
     *
     *
     * @param message - the new message of the tweet
     * @throws TweetTooLongException - is thrown when the message is over 140 charactors
     *
     * @see ImportantTweet
     * @see NormalTweet
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }
    /**
     * get date information
    */
    public Date getDate(){
        return date;
    }

    /**
     * set date
     * @param date -- the new date of the tweet
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Check whether the tweet is important
     * @return
     */
    public abstract Boolean isImportant();

    /**
     * print the message
     * @return
     */

    public String toString(){
        return date.toString() + " |"+message;

    }
}

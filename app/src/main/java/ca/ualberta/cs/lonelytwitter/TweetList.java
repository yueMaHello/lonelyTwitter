package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * Created by a123456 on 2018-02-15.
 */

public class TweetList{
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    public void add(Tweet tweet){
        tweets.add(tweet);

    }
    public void addTweet(Tweet tweet)throws DuplicationException{
        if(tweets.contains(tweet)){
            throw new DuplicationException();
        }
        else{
            tweets.add(tweet);
        }

    }

    public ArrayList<Tweet> getTweets(){

        Comparator c = new Comparator<Tweet>() {
            public int compare(Tweet o1, Tweet o2) {
                // TODO Auto-generated method stub
                if(o1.getDate().before(o2.getDate())){
                    return 1;}
                else{ return -1;}
            }
        };
        Collections.sort(tweets,c);
        return tweets;

    }
    public int getCount(){

        return tweets.size();
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }
    public Tweet getTweet(int index) {
        return tweets.get(index);
    }
    public void delete(Tweet tweet){
        tweets.remove(tweet);

    }
}

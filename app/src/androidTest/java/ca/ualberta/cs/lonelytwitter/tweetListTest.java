package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

/**
 * Created by a123456 on 2018-02-15.
 */

public class tweetListTest extends ActivityInstrumentationTestCase2 {
    public tweetListTest(){
        super(LonelyTwitterActivity.class);
    }
    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal Tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }
    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }
    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal tweet");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getDate(),tweet.getDate());
    }
    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal tweet");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));

    }
    public void testAddTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal tweet");
        tweets.add(tweet);
        try{

            tweets.addTweet(tweet);
        }
        catch(Exception DuplicationException){
            assertTrue(Boolean.TRUE);
        }

    }
    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal tweet1");
        tweets.add(tweet);
        Tweet tweet2 = new NormalTweet("adding a normal tweet2");
        tweets.add(tweet2);
        Tweet tweet3 = new NormalTweet("adding a normal tweet3");
        tweets.add(tweet3);
        ArrayList<Tweet> sorted_tweets =  tweets.getTweets();
        assertEquals(sorted_tweets.get(0),tweet3);
        assertEquals(sorted_tweets.get(2),tweet);


    }
    public void testCountTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding a normal tweet1");
        tweets.add(tweet);
        Tweet tweet2 = new NormalTweet("adding a normal tweet2");
        tweets.add(tweet2);
        Tweet tweet3 = new NormalTweet("adding a normal tweet3");
        tweets.add(tweet3);
        assertEquals(3,tweets.getCount());

    }
}

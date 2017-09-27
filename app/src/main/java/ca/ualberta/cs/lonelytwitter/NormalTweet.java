package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represent Normal Tweeter
 * @author xinmeng1
 * @version 1.5
 * @see ca.ualberta.cs.lonelytwitter.Tweet
 * @since 1.0
 *
 */

public class NormalTweet extends Tweet {

    public NormalTweet(String message) {
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}

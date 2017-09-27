
/*
 *Tweet
 * version 1.0
 * September 26, 2017
 * Copyright 1995-1999 Sun Microsystems, Inc. All rights reserved. Used by permission.
 * Adapted with permission from CODE CONVENTIONS FOR THE JAVA TM PROGRAMMING LANGUAGE.
 * Copyright 1995-1999 Sun Microsysytems, Inc. All rights reserved.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represent as tweet
 *
 * @auther xinmeng1
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet {

    private String message;
    private Date date;

    /**
     * Constructs a tweet object
     */
    public Tweet() {
        this();
    }


    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }
    /**
     * Constructs a tweet object
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    /**
     * Sets tweet message
     *
     * @param message tweet mesage
     * @throws TweetTooLongException
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}

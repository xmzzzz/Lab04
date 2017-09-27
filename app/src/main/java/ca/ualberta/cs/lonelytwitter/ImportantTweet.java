/*
 *LonelyTwitterActivity
 * version 1.0
 * September 26, 2017
 * Copyright 1995-1999 Sun Microsystems, Inc. All rights reserved. Used by permission.
 * Adapted with permission from CODE CONVENTIONS FOR THE JAVA TM PROGRAMMING LANGUAGE.
 * Copyright 1995-1999 Sun Microsysytems, Inc. All rights reserved.
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represent Important Tweeter
 * @author xinmeng1
 * @version 1.5
 * @see ca.ualberta.cs.lonelytwitter.Tweet
 * @see ca.ualberta.cs.lonelytwitter.Tweetable
 * @since 1.0
 *
 */

public class ImportantTweet extends Tweet implements Tweetable {

    public ImportantTweet(String message){
        super(message);
    }

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }


    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}

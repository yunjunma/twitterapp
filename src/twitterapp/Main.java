
package twitterapp;

import java.util.List;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.Status;

/**
 *
 * @author jun
 */
public class Main {

    public static void main(String[] args) throws TwitterException {
        
//        LoginForm login = new LoginForm();
//        login.setVisible(true);
        ConfigurationBuilder cb = new ConfigurationBuilder();
        
        
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("") 
                .setOAuthConsumerSecret("")
                .setOAuthAccessToken("")
                .setOAuthAccessTokenSecret("");
        
        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter4j.Twitter twitter = tf.getInstance();
//        twitter = tf.getInstance();
        Home home = new Home(twitter);
        home.setVisible(true);
        
        
    }
    
}

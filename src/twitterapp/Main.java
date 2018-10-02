
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
        
        //Jun, use Richard's twitter's API key
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("s3vvKcx6DwySzyFQ27jYdLMEA") 
                .setOAuthConsumerSecret("oxo2Y9BMpXSIkPIlQ3s8SpwhrDnIaIWOhQXM0DzwVMV0Zkq5dF")
                .setOAuthAccessToken("833741570662821891-M07arKYTNSU5pN96MVQmOMLMpITTzx5")
                .setOAuthAccessTokenSecret("Uim0JDgleEbQA00hphtejl3Zo64X2iz8GHKextAGLyQjd");
        
        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter4j.Twitter twitter = tf.getInstance();
//        twitter = tf.getInstance();
        Home home = new Home(twitter);
        home.setVisible(true);
        
        
    }
    
}

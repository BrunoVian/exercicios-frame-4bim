
package br.com.unipar.facade.api;

/**
 *
 * @author bruno
 */
public class TwitterAPI {
    public void getTweets(String accessToken, String username) {
        System.out.println("Tweets de @" + username + ": ...");
    }
}

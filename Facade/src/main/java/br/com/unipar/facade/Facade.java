package br.com.unipar.facade;

import br.com.unipar.facade.facade.TwitterFacade;

/**
 *
 * @author bruno
 */
public class Facade {

    public static void main(String[] args) {
       String apiKey = "seuApiKey";
        String apiSecret = "seuApiSecret";

        TwitterFacade twitterFacade = new TwitterFacade(apiKey, apiSecret);

        String username = "bruno";

        twitterFacade.getRecentTweets(username);
    }
}

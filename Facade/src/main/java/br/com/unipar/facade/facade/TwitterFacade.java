
package br.com.unipar.facade.facade;

import br.com.unipar.facade.api.TwitterAPI;
import br.com.unipar.facade.auth.TwitterAuth;

/**
 *
 * @author bruno
 */
public class TwitterFacade {
    private TwitterAuth auth;
    private TwitterAPI api;

    public TwitterFacade(String apiKey, String apiSecret) {
        this.auth = new TwitterAuth();
        this.api = new TwitterAPI();

        String requestToken = auth.getRequestToken(apiKey, apiSecret);

        String accessToken = auth.getAccessToken(requestToken);
    }

    public void getRecentTweets(String username) {
        api.getTweets("accessToken", username);
    }
}

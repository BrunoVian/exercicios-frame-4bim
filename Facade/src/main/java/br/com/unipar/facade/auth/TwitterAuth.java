
package br.com.unipar.facade.auth;

/**
 *
 * @author bruno
 */
public class TwitterAuth {
    
    public String getRequestToken(String apiKey, String apiSecret) {
        return "requestToken";
    }

    public String getAccessToken(String requestToken) {
        return "accessToken";
        
    }
}

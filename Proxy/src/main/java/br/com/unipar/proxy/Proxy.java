
package br.com.unipar.proxy;

import br.com.unipar.proxy.images.Image;
import br.com.unipar.proxy.images.ImageProxy;

/**
 *
 * @author bruno
 */
public class Proxy {

    public static void main(String[] args) {
        
        Image image = new ImageProxy("imagem_hd.jpg");

        image.display();

    }
}

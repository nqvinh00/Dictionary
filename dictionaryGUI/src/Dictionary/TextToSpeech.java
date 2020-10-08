package Dictionary;

import java.awt.*;
import java.io.IOException;
import java.net.*;

public class TextToSpeech {
    public void playSound(String text) throws IOException, URISyntaxException {
        URL url =  new URL("http://api.voicerss.org/?key=01608ac85151457894a39a79a37fbd19&hl=en-us&src=" + text);
        URI uri = new URI(url.getProtocol(), url.getUserInfo(), IDN.toASCII(url.getHost()), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        String correctEncodedURL=uri.toASCIIString();
        Desktop.getDesktop().browse(URI.create(correctEncodedURL));
    }

//    public static void main(String[] args) throws Exception {
//        TextToSpeech tts = new TextToSpeech();
//
//        tts.playSound("Fuck you");
//    }
}
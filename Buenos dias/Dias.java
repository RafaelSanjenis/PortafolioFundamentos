import java.io.*;
import java.net.*;
import java.applet.*;

class Dias{
    public Dias(String arch){
        File f = new File(arch);
        URL myUrl = null;

        try{
            myUrl = f.toURL();

        }catch(MalformedURLException mfue){}
        AudioClip sound = Applet.newAudioClip(myUrl);
        sound.play();
    }    
}
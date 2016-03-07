/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspaceinvaders.Media;

//import Media.audio.MP3;
import java.awt.Image;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.imageio.ImageIO;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Paths {
                
   /* public static MP3 loadAudio(String name) {
        MP3 result = null;
        
        try {
            result = new MP3("Media/audio/" + name);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        }

        return result;
    } */
    
    public static Image loadImage(String name) {
        Image result = null;

        try {
            result = ImageIO.read(Paths.class.getClassLoader().getResourceAsStream("jspaceinvaders/Media/images/" + name));
        } catch (Exception ex) {
        }
        
        return result;
    }
    
    public static InputStreamReader loadLevel(int index) {
        InputStreamReader result = new InputStreamReader(Paths.class.getClassLoader().getResourceAsStream("jspaceinvaders/Media/levels/level" + index + ".txt"));

        return result;
    }
    
    private Paths() { }
    
    
    
}

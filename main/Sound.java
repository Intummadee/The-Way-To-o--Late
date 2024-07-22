package main;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

public class Sound {
    Clip clip;
    URL soundURL[] = new URL[30]; // store the file path of many sound

    public Sound(){
        soundURL[0] = getClass().getResource("/sound/song.wav");
        soundURL[1] = getClass().getResource("/sound/goal.wav");
        
        
    }

    public void setFile(int i){
        try{
            // format open audio file in java
            AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
            clip = AudioSystem.getClip();
            clip.open(ais);
            FloatControl gainControl = 
            (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-20.0f);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void play(){
    	
        clip.start();
    }

    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop(){
        clip.stop();
    }

}
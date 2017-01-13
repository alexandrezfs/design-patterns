package fr.alexandrenguyen.adapter;

/**
 * Created by alenguye on 12/01/2017.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc() {

    }

    @Override
    public void playMp4() {
        System.out.println("Playing MP4...");
    }
}

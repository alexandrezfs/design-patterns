package fr.alexandrenguyen.adapter;

/**
 * Created by alenguye on 12/01/2017.
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    public AudioPlayer() {
        mediaAdapter = new MediaAdapter(MediaType.MP4);
    }

    public void play() {
        mediaAdapter.play();
    }
}

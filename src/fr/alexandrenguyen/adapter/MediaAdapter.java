package fr.alexandrenguyen.adapter;

/**
 * Created by alenguye on 12/01/2017.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(MediaType mediaType) {

        if(mediaType.equals(MediaType.MP4)) {
            advancedMediaPlayer = new Mp4Player();
        }
        else if(mediaType.equals(MediaType.VLC)) {
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play() {

        if(advancedMediaPlayer != null) {

            if(advancedMediaPlayer.getClass() == Mp4Player.class) {
                advancedMediaPlayer.playMp4();
            }

            if(advancedMediaPlayer.getClass() == VlcPlayer.class) {
                advancedMediaPlayer.playVlc();
            }

        }
        else {
            System.out.println("advancedMediaPlayer n'a pas été initialisé");
        }
    }
}

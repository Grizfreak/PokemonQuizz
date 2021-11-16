package com.example.PokemonQuizz;

import android.media.MediaPlayer;

import androidx.appcompat.app.AppCompatActivity;

public class MusicManager {
    public AppCompatActivity context;
    public MediaPlayer mediaPlayer;
    //TODO SOUNDPOOL FOR BUTTONS
    public MusicManager(AppCompatActivity pcontext){
        context = pcontext;
        mediaPlayer = new MediaPlayer();
    }
    public void playMenuMusic(){
        playOnMediaPlayer(R.raw.main_menu_pokemon_home);
    }

    public void playScoresMusic(){
        playOnMediaPlayer(R.raw.pokemon_center);
    }

    private void playOnMediaPlayer(int rId){
        mediaPlayer = MediaPlayer.create(context.getApplicationContext(), rId);
        mediaPlayer.setVolume(0.3f,0.3f);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }
    public void playLevel(int score) {
        switch(score){
            case 0 :
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                playOnMediaPlayer(R.raw.hau_battle_music);
                break;
            case 50 :
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                playOnMediaPlayer(R.raw.hau_battle_music);
                break;
            case 100 :
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                playOnMediaPlayer(R.raw.hau_battle_music);
                break;

            case 200 :
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                playOnMediaPlayer(R.raw.hau_battle_music);
                break;
        }

    }


    public void start(){
        mediaPlayer.start();
    }
    public void pause(){
        mediaPlayer.pause();
    }
}

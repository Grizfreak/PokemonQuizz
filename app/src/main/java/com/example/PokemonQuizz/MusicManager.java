package com.example.PokemonQuizz;

import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;

import androidx.appcompat.app.AppCompatActivity;

public class MusicManager {
    public AppCompatActivity context;
    public MediaPlayer mediaPlayer;
    public SoundPool soundPool;
    public int IDbutton_pressed;
    public int IDrandomize_sound;
    public int IDscores_poping;
    public boolean loaded = false;
    //TODO SOUNDPOOL FOR BUTTONS
    public MusicManager(AppCompatActivity pcontext){
        context = pcontext;
        buildSoundpool(context);
        mediaPlayer = new MediaPlayer();
    }

    private void buildSoundpool(AppCompatActivity pcontext) {
        SoundPool.Builder builder = new SoundPool.Builder();
        AudioAttributes audioAttrib = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();
        builder.setAudioAttributes(audioAttrib).setMaxStreams(5);
        this.soundPool = builder.build();
        // When Sound Pool load complete.
        this.soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded = true;
            }
        });

        // Load sound file (destroy.wav) into SoundPool.
        this.IDbutton_pressed = this.soundPool.load(context, R.raw.button_pressed,1);

        // Load sound file (gun.wav) into SoundPool.
        this.IDrandomize_sound = this.soundPool.load(context, R.raw.randomize_sound,1);

    }

    public void playMenuMusic(){
        if(mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        playOnMediaPlayer(R.raw.main_menu_pokemon_home);
    }

    public void playScoresMusic(){
        if(mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        playOnMediaPlayer(R.raw.pokemon_center);
    }

    private void playOnMediaPlayer(int rId){
        mediaPlayer = MediaPlayer.create(context.getApplicationContext(), rId);
        mediaPlayer.setVolume(0.3f,0.3f);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }

    private void playOnceOnMediaPlayer(int rId){
        mediaPlayer = MediaPlayer.create(context.getApplicationContext(), rId);
        mediaPlayer.setVolume(0.3f,0.3f);
        mediaPlayer.start();
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
                playOnMediaPlayer(R.raw.pokemon_xy_battle);
                break;
            case 100 :
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                playOnMediaPlayer(R.raw.pokemon_dp_battle);
                break;

            case 200 :
                if(mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                playOnMediaPlayer(R.raw.pokemon_swsh_battle);
                break;
        }

    }

    public void playButtonSound(){
        float leftVolumn = 0.5f;
        float rightVolumn = 0.5f;
        // Play sound of gunfire. Returns the ID of the new stream.
        int streamId = this.soundPool.play(IDbutton_pressed,leftVolumn, rightVolumn, 1, 0, 1f);
    }

    public void playPokedexRoll(){
        float leftVolumn = 0.5f;
        float rightVolumn = 0.5f;
        // Play sound of gunfire. Returns the ID of the new stream.
        int streamId = this.soundPool.play(IDrandomize_sound,leftVolumn, rightVolumn, 1, 0, 1f);
    }

    public void playOnScoresPoping(){
        playOnceOnMediaPlayer(R.raw.on_scores_poping);
    }


    public void start(){
        mediaPlayer.start();
    }
    public void pause(){
        mediaPlayer.pause();
    }
}

package com.example.PokemonQuizz;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

public class MenuActivity extends AppCompatActivity {

    public LinearLayout playbox;
    public Button changeScene,playButton,scoresButton, guideButton;
    public TextView pseudoEdit;
    public MusicManager musicM;

    @Override
    protected void onResume() {
        super.onResume();
        musicM.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        musicM.pause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        musicM.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        musicM.pause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(getSupportActionBar()).hide();
        //Remove notification bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        playbox = findViewById(R.id.playbox);
        changeScene = findViewById(R.id.changeScene);
        playButton = findViewById(R.id.playButton);
        pseudoEdit = findViewById(R.id.pseudoEntry);
        scoresButton = findViewById(R.id.ScoresButton);
        guideButton = findViewById(R.id.guideButton);
        musicM = new MusicManager(this);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        musicM.playMenuMusic();
        pseudoEdit.setGravity(Gravity.CENTER_HORIZONTAL);
        playButton.setOnClickListener(view -> {
            musicM.playButtonSound();
            playbox.setVisibility(View.VISIBLE);
        });

        scoresButton.setOnClickListener(view -> {
            musicM.playButtonSound();
            musicM.pause();
            Intent intent = new Intent(view.getContext(),ScoresActivity.class);
            intent.putExtra("nouveauscore",false);
            view.getContext().startActivity(intent);
        });

        guideButton.setOnClickListener(view -> {
            musicM.playButtonSound();
            new AlertDialog.Builder(view.getContext())
                    .setTitle("Guide d'utilisation")
                    .setMessage("Dans ce jeu, un pokémon va vous être présenté, vous aurez quatre propositions dont une contenant le véritable nom de celui-ci ! A vous de le retrouver et de cliquer dessus jeune dresseur ! Attention cependant," +
                            " vous serez chronométré et n'aurez que 3 possibilités d'échouer !")

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton(R.string.ok, (dialog, which) -> {
                        // Continue with delete operation
                    })
                    .setIcon(R.drawable.prof_oak_icon)
                    .show();
        });

        changeScene.setOnClickListener(view -> {
            musicM.playButtonSound();
            musicM.pause();
            if (!pseudoEdit.getText().toString().trim().equals("")) {
                Intent intent = new Intent(view.getContext(), GameActivity.class);
                intent.putExtra("name", pseudoEdit.getText().toString().trim());
                view.getContext().startActivity(intent);
            }
            else {
                pseudoEdit.setError("Veuillez entrer un nom valide");
            }

        });

    }
}
package com.example.PokemonQuizz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Objects;

/**
 * Activity launched at start and used to access differents Activities
 */
public class MenuActivity extends AppCompatActivity {

    /**
     * Attributes declaration
     */
    public LinearLayout playbox;
    public Button changeScene, playButton, scoresButton, guideButton, creditsButton;
    public TextView pseudoEdit;
    public MusicManager musicM;

    /**
     * Function used to start playing music
     */
    @Override
    protected void onResume() {
        super.onResume();
        musicM.start();
    }

    /**
     * Function used to stop playing music
     */
    @Override
    protected void onPause() {
        super.onPause();
        musicM.pause();
    }

    /**
     * Function used to stop playing music
     */
    @Override
    protected void onStop() {
        super.onStop();
        musicM.pause();
    }

    /**
     * Function used to stop playing music
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        musicM.pause();
    }

    /**
     * Default function used at creation of the Activity
     *
     * @param savedInstanceState bundle used for app
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Remove title bar && Remove notification bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(getSupportActionBar()).hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);

        //Attributes creation
        playbox = findViewById(R.id.playbox);
        changeScene = findViewById(R.id.changeScene);
        playButton = findViewById(R.id.playButton);
        pseudoEdit = findViewById(R.id.pseudoEntry);
        scoresButton = findViewById(R.id.ScoresButton);
        guideButton = findViewById(R.id.guideButton);
        creditsButton = findViewById(R.id.Credits);
        musicM = new MusicManager(this);
        musicM.playMenuMusic();
        pseudoEdit.setGravity(Gravity.CENTER_HORIZONTAL);

        //Setting up Listeners on all buttons
        playButton.setOnClickListener(view -> {
            musicM.playButtonSound();
            playbox.setVisibility(View.VISIBLE);
        });

        scoresButton.setOnClickListener(view -> {
            musicM.playButtonSound();
            musicM.pause();
            Intent intent = new Intent(view.getContext(), ScoresActivity.class);
            intent.putExtra("nouveauscore", false);
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
                    })
                    .setIcon(R.drawable.prof_oak_icon)
                    .show();
        });

        creditsButton.setOnClickListener(view -> new AlertDialog.Builder(view.getContext())
                .setTitle("Crédits et mentions")
                .setMessage("Cette appplication a été réalisée par Antonin AUBERT (moi), Etudiant en 2ème année de DUT Informatique à l'IUT de Laval ! " +
                        "Cette oeuvre est la propriété de Le Mans Université et relève de la législation française et internationale sur le droit d’auteur et la propriété intellectuelle. " +
                        "Amusez-vous bien !")

                .setIcon(R.drawable.logo_iut)
                .setPositiveButton(R.string.ok, (dialog, which) -> {

                })
                .show());

        changeScene.setOnClickListener(view -> {
            musicM.playButtonSound();
            musicM.pause();
            if (!pseudoEdit.getText().toString().trim().equals("")) {
                Intent intent = new Intent(view.getContext(), GameActivity.class);
                intent.putExtra("name", pseudoEdit.getText().toString().trim());
                view.getContext().startActivity(intent);
            } else {
                pseudoEdit.setError("Veuillez entrer un nom valide");
            }

        });

    }
}
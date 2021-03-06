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
                    .setMessage("Dans ce jeu, un pok??mon va vous ??tre pr??sent??, vous aurez quatre propositions dont une contenant le v??ritable nom de celui-ci ! A vous de le retrouver et de cliquer dessus jeune dresseur ! Attention cependant," +
                            " vous serez chronom??tr?? et n'aurez que 3 possibilit??s d'??chouer !")

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton(R.string.ok, (dialog, which) -> {
                    })
                    .setIcon(R.drawable.prof_oak_icon)
                    .show();
        });

        creditsButton.setOnClickListener(view -> new AlertDialog.Builder(view.getContext())
                .setTitle("Cr??dits et mentions")
                .setMessage("Cette appplication a ??t?? r??alis??e par Antonin AUBERT (moi), Etudiant en 2??me ann??e de DUT Informatique ?? l'IUT de Laval ! " +
                        "Cette oeuvre est la propri??t?? de Le Mans Universit?? et rel??ve de la l??gislation fran??aise et internationale sur le droit d???auteur et la propri??t?? intellectuelle. " +
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
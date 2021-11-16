package com.example.PokemonQuizz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    public LinearLayout playbox;
    public Button changeScene,playButton,scoresButton;
    public TextView pseudoEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        playbox = findViewById(R.id.playbox);
        changeScene = findViewById(R.id.changeScene);
        playButton = findViewById(R.id.playButton);
        pseudoEdit = findViewById(R.id.pseudoEntry);
        scoresButton = findViewById(R.id.ScoresButton);

        pseudoEdit.setGravity(Gravity.CENTER_HORIZONTAL);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playbox.setVisibility(View.VISIBLE);
            }
        });

        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),ScoresActivity.class);
                intent.putExtra("nouveauscore",false);
                view.getContext().startActivity(intent);
            }
        });

        changeScene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!pseudoEdit.getText().toString().trim().equals("")) {
                    Intent intent = new Intent(view.getContext(), GameActivity.class);
                    intent.putExtra("name", pseudoEdit.getText().toString().trim());
                    view.getContext().startActivity(intent);
                }
                else {
                    pseudoEdit.setError("Veuillez entrer un nom valide");
                    return;
                }

            }
        });

    }
}
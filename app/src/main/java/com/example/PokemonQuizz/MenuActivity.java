package com.example.PokemonQuizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    public LinearLayout playbox;
    public Button changeScene,playButton;
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

        pseudoEdit.setGravity(Gravity.CENTER_HORIZONTAL);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playbox.setVisibility(View.VISIBLE);
            }
        });

        changeScene.setOnClickListener(new View.OnClickListener() {
            @Override
            //TODO check entrée dans la textbox
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), GameActivity.class);
                view.getContext().startActivity(intent);

            }
        });

    }
}
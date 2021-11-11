package com.example.PokemonQuizz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class GameActivity extends AppCompatActivity {

    public TypedArray imgs_black ;
    public ImageView pokemon;
    public ImageButton reload;
    public boolean displaycolor;
    public ImageButton display;
    public PokemonNames actualPokemonName;
    public List<PokemonNames> displayed_names = new ArrayList<>();
    public Button btn1, btn2, btn3, btn4;
    public TextView chrono;
    public ProgressBar answerBar;
    public int nbfaults = 0;
    public Score actualScore;
    public int maxfaults = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        actualScore = new Score(intent.getExtras().getString("name"));
        pokemon = findViewById(R.id.pokemonquestion);
        display = findViewById(R.id.display);
        reload = findViewById(R.id.reload);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        chrono = findViewById(R.id.chrono);
        answerBar = findViewById(R.id.answerBar);
        btn1.setBackgroundColor(getResources().getColor(R.color.red));
        btn2.setBackgroundColor(getResources().getColor(R.color.blue));
        btn3.setBackgroundColor(getResources().getColor(R.color.yellow));
        btn4.setBackgroundColor(getResources().getColor(R.color.green));

        imgs_black = getResources().obtainTypedArray(R.array.pokemon_black_images_array);
        displayed_names = Arrays.asList(PokemonNames.values());
        //TODO on roll roulette
        getRndImg();
        getPokemonName();
        reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getRndImg();
                getPokemonName();
            }
        });
        display.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){ displayColor(); }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkResult(btn1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkResult(btn2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkResult(btn3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkResult(btn4);
            }
        });
    }

    private void getPokemonName() {
        List<PokemonNames> names_to_get = new ArrayList<>(displayed_names);
        List<PokemonNames> names = new ArrayList<>();
        int rndInt;
        final Random rand = new Random();
        String resName = getResourceNameFromClassByID(R.drawable.class, (Integer) pokemon.getTag());
        Log.e("name",resName);
        resName = resName.replace("_","");
        Log.e("name",resName);
        int num = Integer.parseInt(resName);
        names.add(names_to_get.get(num-1));
        actualPokemonName = names.get(0);
        rndInt = rand.nextInt(names_to_get.size());
        names.add(names_to_get.remove(rndInt));
        rndInt = rand.nextInt(names_to_get.size());
        names.add(names_to_get.remove(rndInt));
        rndInt = rand.nextInt(names_to_get.size());
        names.add(names_to_get.remove(rndInt));
        for (PokemonNames str : names){
            Log.i("list",str.toString());
        }
        Collections.shuffle(names);
        Log.e("name",String.valueOf(num));
        btn1.setText(names.remove(0).toString());
        btn2.setText(names.remove(0).toString());
        btn3.setText(names.remove(0).toString());
        btn4.setText(names.remove(0).toString());
    }

    public String getResourceNameFromClassByID(Class<?> aClass, int resourceID)
            throws IllegalArgumentException{
        /* Get all Fields from the class passed. */
        Field[] drawableFields = aClass.getFields();

        /* Loop through all Fields. */
        for(Field f : drawableFields){
            try {
                /* All fields within the subclasses of R
                 * are Integers, so we need no type-check here. */

                /* Compare to the resourceID we are searching. */
                if (resourceID == f.getInt(null))
                    return f.getName(); // Return the name.
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        /* Throw Exception if nothing was found*/
        throw new IllegalArgumentException();
    }

    public void getRndImg(){

        final Random rand = new Random();
        final int rndInt = rand.nextInt(imgs_black.length());
        final int resID = imgs_black.getResourceId(rndInt, 0);
        displaycolor=false;
        int color = ContextCompat.getColor(this, R.color.black);
        pokemon.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        pokemon.setImageResource(resID);
        pokemon.setTag(resID);
    }

    public void displayColor(){
        if(displaycolor){
            displaycolor=false;
            int color = ContextCompat.getColor(this, R.color.black);
            pokemon.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        }else{
            displaycolor = true;
            pokemon.setColorFilter(null);
        }
    }

    private void checkResult(Button btn) {
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);
        if(actualPokemonName.toString() == btn.getText().toString()){
            Toast toast = Toast.makeText(this, "cévré", Toast.LENGTH_SHORT);
            toast.show();

            displayGoodAnswer();
        } else {
            Toast toast = Toast.makeText(this, "céfo", Toast.LENGTH_SHORT);
            toast.show();
            displayBadAnswer();
        }
    }

    private void displayGoodAnswer() {
        chrono.setTextColor(ContextCompat.getColor(this, R.color.green));
        chrono.setText("Bien joué ! Nos équipes préparent le prochain !");
        displayColor();
        actualScore.addPoint();
        new CountDownTimer(3000, 1) {

            public void onTick(long millisUntilFinished) {
                displayProgress(millisUntilFinished);
            }

            public void onFinish() {
                displayColor();
                answerBar.setProgress(100);
                reload.callOnClick();
                answerBar.setProgress(0);
                chrono.setText("");
                reactiveButtons();
            }
        }.start();
    }
    private void displayBadAnswer() {
        chrono.setTextColor(ContextCompat.getColor(this, R.color.red));
        chrono.setText("Dommage, ce pokémon était "+actualPokemonName.toString().toUpperCase(Locale.ROOT));
        displayColor();
        nbfaults++;
        new CountDownTimer(3000, 1) {

            public void onTick(long millisUntilFinished) {
                displayProgress(millisUntilFinished);
            }

            public void onFinish() {
                displayColor();
                answerBar.setProgress(100);
                reload.callOnClick();
                if(nbfaults>=maxfaults){
                    Log.e("Hello","YOU LOSE");
                    Intent intent = new Intent(GameActivity.this, ScoresActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.putExtra("nouveauscore",true);
                    intent.putExtra("score",actualScore);
                    getApplicationContext().startActivity(intent);
                }
                answerBar.setProgress(0);
                chrono.setText("");
                reactiveButtons();
            }
        }.start();
    }

    private void reactiveButtons() {
        btn1.setClickable(true);
        btn2.setClickable(true);
        btn3.setClickable(true);
        btn4.setClickable(true);
    }

    private void displayProgress(long millisUntilFinished) {
        int maxValue=answerBar.getMax();
        long progress = ((3000-millisUntilFinished) * maxValue) / 3000; // (3000 * answerBar.getProgress())/100 = millisUntilFinished
        Log.e("test", String.valueOf(progress));
        answerBar.setProgress((int) progress);
    }
}
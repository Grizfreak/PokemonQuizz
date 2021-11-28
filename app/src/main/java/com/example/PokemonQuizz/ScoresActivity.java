package com.example.PokemonQuizz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.opengl.Visibility;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.BounceInterpolator;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;
import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;

import pl.droidsonroids.gif.GifImageView;

/**
 * Activity launched to display scores of the player
 */
public class ScoresActivity extends AppCompatActivity {


    /**
     * Attributes declaration
     */
    public Score newScoreReceived;
    public ScoresList scoresSaved;
    public boolean newscoreget;
    public ImageView scoresImage;
    public final String filename = "scores.xml";
    public SwipeMenuListView listView;
    public MusicManager musicM;
    public GifImageView gifImage;

    /**
     * Default function used at creation of the Activity
     *
     * @param savedInstanceState bundle used for app
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Remove title bar && Remove notification bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Objects.requireNonNull(getSupportActionBar()).hide();
        super.onCreate(savedInstanceState);
        //if file doesn't exist, creation of a file
        if (createNewFile()) {
            scoresSaved = new ScoresList();
            saveFile();
        } else { //else reading of file existing
            readAncientList();
        }
        setContentView(R.layout.activity_scores);
        listView = findViewById(R.id.scoresList);
        scoresImage = findViewById(R.id.scoresImage);
        Intent it = getIntent();
        musicM = new MusicManager(this);
        musicM.playScoresMusic();
        newscoreget = it.getBooleanExtra("nouveauscore", false);
        newScoreReceived = (Score) it.getSerializableExtra("score");
        gifImage = findViewById(R.id.gifImage);
        gifImage.setVisibility(View.GONE);
        //if there is a score created from GameActivity, saving file with new score
        if (newscoreget) {
            scoresSaved.addScore(newScoreReceived);
            displayImage();
            saveFile();
        }

        // android.R.layout.simple_list_item_1 is a constant predefined layout of Android.
        // used to create a ListView with simple ListItem (Only one TextView).
        adaptList();
        listView.setOnMenuItemClickListener((position, menu, index) -> {
            if (index == 0) {
                scoresSaved.removeScore(position);
                adaptList();
                saveFile();
            }
            // false : close the menu; true : not close the menu
            return false;
        });
        listView.setSwipeDirection(SwipeMenuListView.DIRECTION_LEFT);
        listView.setCloseInterpolator(new BounceInterpolator());
        @SuppressLint("UseCompatLoadingForDrawables") SwipeMenuCreator creator = menu -> {
            // create "delete" item
            SwipeMenuItem deleteItem = new SwipeMenuItem(
                    getApplicationContext());
            // set item background
            deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9,
                    0x3F, 0x25)));
            // set item width
            deleteItem.setWidth(dp2px(menu.getContext(), 90));
            // set a icon
            deleteItem.setIcon(getApplicationContext().getResources().getDrawable(R.drawable.ic_delete, getTheme()));
            // add to menu
            menu.addMenuItem(deleteItem);
        };
        // set creator
        listView.setMenuCreator(creator);
    }

    /**
     * Function used to display an image depending on rank of the player
     */
    private void displayImage() {
        int position = 4;
        for (Score sc : scoresSaved.scores) {
            if (sc.equals(newScoreReceived)) {
                position = scoresSaved.scores.indexOf(sc);
            }
        }
        switch (position) {
            case 0:
                gifImage.setVisibility(View.VISIBLE);
                scoresImage.setImageResource(R.drawable.first);
                musicM.playOnScoresPoping();
                break;
            case 1:
                gifImage.setVisibility(View.VISIBLE);
                musicM.playOnScoresPoping();
                scoresImage.setImageResource(R.drawable.second);
                break;
            case 2:
                gifImage.setVisibility(View.VISIBLE);
                musicM.playOnScoresPoping();
                scoresImage.setImageResource(R.drawable.third);
                break;
            default:
                scoresImage.setImageResource(R.drawable.fourth);
                break;
        }
    }


    /**
     * Function used to save all scores in the file
     */
    private void saveFile() {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(scoresSaved);
            Log.e("json", json);
            write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * Function used to create a new file
     * @return if the file has been created or not
     */
    private boolean createNewFile() {
        File file = new File(getApplicationContext().getCacheDir(), filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
                Log.e("test", "File didn't exist, so I created it !");
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }


    /**
     * Function used to display Scores in a ListView
     */
    private void adaptList() {
        ArrayAdapter<Score> arrayAdapter
                = new ArrayAdapter<>(this, R.layout.list_black_text, R.id.list_content, scoresSaved.scores);

        listView.setAdapter(arrayAdapter);
    }


    /**
     * Function used to read the list and create a ScoresList Object
     */
    private void readAncientList() {
        Gson gson = new Gson();
        try {
            Reader reader = new FileReader(getApplicationContext().getCacheDir() + "/" + filename);
            scoresSaved = gson.fromJson(reader, ScoresList.class);
        /*if (gson.fromJson(reader,ScoresList.class) != null){
            scoresSaved = gson.fromJson(reader,ScoresList.class);
        }
        if (scoresSaved == null){
            scoresSaved = new ScoresList();
        }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * Function used to write the ScoresList into a json file
     * @param json the json string to serialize
     * @throws IOException
     */
    private void write(String json) throws IOException {
        File file = new File(getApplicationContext().getCacheDir(), filename);
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(json);
        bw.close();
    }

    /**
     * Function used on creating SwipingListView
     * @param ctx the context of the current activity
     * @param dp the width of the item to display
     * @return the used size of displaying item
     */
    public static int dp2px(Context ctx, float dp) {
        final float scale = ctx.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    /**
     * Function used to modify the onBackPressed usage
     */
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    /**
     * Function used to resume music on app resumed
     */
    @Override
    protected void onResume() {
        super.onResume();
        musicM.start();
    }

    /**
     * Function used to pause music on app paused
     */
    @Override
    protected void onPause() {
        super.onPause();
        musicM.pause();
    }

    /**
     * Function used to pause music on app stop
     */
    @Override
    protected void onStop() {
        super.onStop();
        musicM.pause();
    }

    /**
     * Function used to pause music when app destroyed
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        musicM.pause();
    }
}
package com.example.PokemonQuizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.animation.BounceInterpolator;
import android.widget.ArrayAdapter;
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

public class ScoresActivity extends AppCompatActivity {


    public Score newScoreReceived;
    public ScoresList scoresSaved;
    public TextView newscore;
    public boolean newscoreget;
    public final String filename="scores.xml";
    public SwipeMenuListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //TODO good Save and load feature
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        if (createNewFile()){
            scoresSaved = new ScoresList();
            saveFile();
        } else {
            readAncientList();
        }
        setContentView(R.layout.activity_scores);
        newscore = findViewById(R.id.score);
        listView = findViewById(R.id.scoresList);
        Intent it = getIntent();
        newscoreget = it.getBooleanExtra("nouveauscore",false);
        newScoreReceived = (Score) it.getSerializableExtra("score");
        if(newscoreget) {
            newscore.setText(newScoreReceived.name + " | " + newScoreReceived.score);
            scoresSaved.scores.add(newScoreReceived);
            saveFile();
        } else {
            newscore.setVisibility(View.GONE);
        }

        // android.R.layout.simple_list_item_1 is a constant predefined layout of Android.
        // used to create a ListView with simple ListItem (Only one TextView).
        adaptList();
        listView.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {
                switch (index) {
                    case 0:
                        scoresSaved.scores.remove(position);
                        adaptList();
                        saveFile();
                        break;
                }
                // false : close the menu; true : not close the menu
                return false;
            }
        });
        listView.setSwipeDirection(SwipeMenuListView.DIRECTION_LEFT);
        listView.setCloseInterpolator(new BounceInterpolator());
        SwipeMenuCreator creator = new SwipeMenuCreator() {
            @Override
            public void create(SwipeMenu menu) {
                // create "delete" item
                SwipeMenuItem deleteItem = new SwipeMenuItem(
                        getApplicationContext());
                // set item background
                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9,
                        0x3F, 0x25)));
                // set item width
                deleteItem.setWidth(dp2px(menu.getContext(),90));
                // set a icon
                deleteItem.setIcon(getApplicationContext().getResources().getDrawable(R.drawable.ic_delete,getTheme()));
                // add to menu
                menu.addMenuItem(deleteItem);
            }
        };
        // set creator
        listView.setMenuCreator(creator);
    }


    private void saveFile() {
        try {
            Gson gson = new Gson();
            String json = gson.toJson(scoresSaved);
            Log.e("json",json);
            write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private boolean createNewFile() {
        File file = new File(getApplicationContext().getCacheDir(), filename);
        if(!file.exists()) {
            try {
                file.createNewFile();
                Log.e("test","File didn't exist, so I created it !");
                return true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }


    private void adaptList() {
        Log.e("test","adapt en cours");
        ArrayAdapter<Score> arrayAdapter
                = new ArrayAdapter<Score>(this, android.R.layout.simple_list_item_1 , scoresSaved.scores);

        listView.setAdapter(arrayAdapter);
    }


    private void readAncientList() {
        Gson gson = new Gson();
        try {
        Reader reader = new FileReader(getApplicationContext().getCacheDir()+"/"+filename);
        scoresSaved = gson.fromJson(reader,ScoresList.class);
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

    private void write(String json) throws IOException{
        File file = new File(getApplicationContext().getCacheDir(), filename);
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(json);
        bw.close();
    }

    public static int dp2px(Context ctx, float dp) {
        final float scale = ctx.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
    }
}
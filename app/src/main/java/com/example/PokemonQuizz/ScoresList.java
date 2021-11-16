package com.example.PokemonQuizz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoresList {
    public List<Score> scores;

    public ScoresList(){
        scores = new ArrayList<Score>();
    }

    public void addScore(Score e){
        scores.add(e);
        sort();
    }

    public void removeScore(int i){
        scores.remove(i);
        sort();
    }

    public void sort(){
        Collections.sort(scores);
    }
}

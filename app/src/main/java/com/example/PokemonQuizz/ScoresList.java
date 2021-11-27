package com.example.PokemonQuizz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class used to store all scores of the application
 */
public class ScoresList {
    /**
     * Defining attributes
     */
    public List<Score> scores;

    /**
     * Default constructor of ScoresList
     */
    public ScoresList() {
        scores = new ArrayList<Score>();
    }

    /**
     * Function used to add a score to the list
     *
     * @param e the score to add
     */
    public void addScore(Score e) {
        scores.add(e);
        sort();
    }

    /**
     * Function used to remove a score from the list
     *
     * @param i the index from the list where removing score
     */
    public void removeScore(int i) {
        scores.remove(i);
        sort();
    }

    /**
     * Function used to sort the list with Scores comparison
     */
    private void sort() {
        Collections.sort(scores);
    }
}

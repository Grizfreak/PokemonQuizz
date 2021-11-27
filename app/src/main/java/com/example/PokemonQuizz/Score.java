package com.example.PokemonQuizz;

import androidx.annotation.NonNull;

import java.io.Serializable;

/**
 * Class used to store the player's score
 */
public class Score implements Serializable, Comparable {
    /**
     * Attributes creation
     */
    public int score;
    public String name;

    /**
     * default Constructor of Score
     *
     * @param name the name of the player
     */
    public Score(String name) {
        score = 0;
        this.name = name;
    }

    /**
     * Function used to increment points of the current player
     */
    public void addPoint() {
        score++;
    }

    /**
     * Function used to return the score
     *
     * @return a String containing name and Score of the class
     */
    @NonNull
    @Override
    public String toString() {
        return this.name + " | " + this.score;
    }

    /**
     * Function used to compare scores and sort it after
     *
     * @param o the object to compare with
     * @return the object most valuable
     */
    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Score)) {
            throw new IllegalArgumentException();
        } else {
            int compareScore = ((Score) o).score;
            return compareScore - this.score;
        }
    }
}

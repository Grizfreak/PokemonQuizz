package com.example.PokemonQuizz;

import java.io.Serializable;

public class Score implements Serializable,Comparable {
    public int score;
    public String name;

    public Score(String name){
        score = 0;
        this.name = name;
    }

    public void addPoint(){
        score++;
    }

    @Override
    public String toString() {
        return this.name + " | " + this.score;
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Score)){
            throw new IllegalArgumentException();
        } else {
            int compareScore = ((Score)o).score;
            return compareScore-this.score;
        }
    }
}

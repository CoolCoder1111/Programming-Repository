package com.mycompany.enumeratorlab;

public class Game {

    private String name;

    public String getName() {
        return name;
    }

    private int min;

    public int getMin() {
        return min;
    }

    private int max;

    public int getMax() {
        return max;
    }
    
       private GameGenres genre;

    public GameGenres getGenre() {
        return genre;
    }

    public Game(String name, int min, int max, GameGenres genre) {
        this.name = name;
        this.min = min;
        this.max = max;
        this.genre = genre;
    }


   
}

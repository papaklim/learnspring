package ru.aklementev.springsimpleapp;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RockMusic implements Music {

    private String[] rockSongsList = new String[]{"rock song 1", "rock song 2", "rock song 3"};

    @Override
    public String getSong() {
        return rockSongsList[new Random().nextInt(rockSongsList.length)];
    }

    @Override
    public void getGenre() {
        System.out.println("Rock Music");
    }
}

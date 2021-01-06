package ru.aklementev.springsimpleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music cMusic;
    private Music rMusic;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music cMusic,
                       @Qualifier("rockMusic") Music rMusic) {
        this.cMusic = cMusic;
        this.rMusic = rMusic;
    }

    public void playClassicalMusic() {
        System.out.println("Playing classical song: " + cMusic.getSong());
    }

    public void playRockMusic() {
        System.out.println("Playing rock song: " + rMusic.getSong());
    }

    public void playMusic(Genre genre) {
        if (genre == Genre.ROCK) {
            System.out.println("Playing random rock song: " + rMusic.getSong());
        }
        if (genre == Genre.CLASSICAL) {
            System.out.println("Playing random classical song: " + cMusic.getSong());
        }
    }

}

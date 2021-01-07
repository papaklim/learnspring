package ru.aklementev.springsimpleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music cMusic;
    private Music rMusic;
    private List<Music> musicGenreList;

//    @Autowired
//    public MusicPlayer(@Qualifier("classicalMusic") Music cMusic,
//                       @Qualifier("rockMusic") Music rMusic) {
//        this.cMusic = cMusic;
//        this.rMusic = rMusic;
//    }

    public MusicPlayer(List<Music> musicGenreList) {
        this.musicGenreList = musicGenreList;
    }


    public void playClassicalMusic() {
        System.out.println("Playing classical song: " + cMusic.getSong());
    }

    public void playRockMusic() {
        System.out.println("Playing rock song: " + rMusic.getSong());
    }

//    public void playMusic(Genre genre) {
//        if (genre == Genre.ROCK) {
//            System.out.println("Playing random rock song: " + rMusic.getSong());
//        }
//        if (genre == Genre.CLASSICAL) {
//            System.out.println("Playing random classical song: " + cMusic.getSong());
//        }
//    }

    public void playMusic() {
        System.out.println(musicGenreList.get(new Random().nextInt(musicGenreList.toArray().length)).getSong());
    }

}

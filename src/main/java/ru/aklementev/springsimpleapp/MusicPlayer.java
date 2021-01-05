package ru.aklementev.springsimpleapp;

import java.util.List;

public class MusicPlayer {

    //    private Music music;
    private List<Music> musicList;
    private String name;
    private int volume;

    public void getMusicList() {
        for (Music i : musicList) {
            i.getGenre();
        }
    }


    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer() {
//    }
//
//    public void setMusic(Music music) {
//        this.music = music;
//    }

//    public void playMusic() {
//        System.out.println("Playing: " + music.getSong());
//    }

}

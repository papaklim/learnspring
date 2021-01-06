package ru.aklementev.springsimpleapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import static ru.aklementev.springsimpleapp.Genre.*;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playClassicalMusic();
//        musicPlayer.playRockMusic();
        musicPlayer.playMusic(ROCK);
        musicPlayer.playMusic(CLASSICAL);

        context.close();
    }
}

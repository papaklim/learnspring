package ru.aklementev.springsimpleapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static ru.aklementev.springsimpleapp.Genre.*;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playClassicalMusic();
//        musicPlayer.playRockMusic();
//        musicPlayer.playMusic(ROCK);
//        musicPlayer.playMusic(CLASSICAL);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        musicPlayer.playMusic();

        context.close();
    }
}

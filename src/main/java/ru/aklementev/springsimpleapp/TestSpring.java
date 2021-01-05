package ru.aklementev.springsimpleapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        Music musicBean = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(musicBean);
//
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        musicPlayer.getMusicList();


        ClassicalMusic classicalMusic1 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        System.out.println(classicalMusic1);

        ClassicalMusic classicalMusic2 = context.getBean("classicalMusicBean", ClassicalMusic.class);
        System.out.println(classicalMusic2);

        context.close();
    }
}

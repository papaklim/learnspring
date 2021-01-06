package ru.aklementev.springsimpleapp;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class ClassicalMusic implements Music {

    String[] classicalSongsList = new String[]{"classical song 1", "classical song 2", "classical song 3"};

    public void myInitMethod() {
        System.out.println("Starting initialization method...");
    }

    public void myDestroyMethod() {
        System.out.println("Starting destruction method...");
    }

    @Override
    public String getSong() {
        return classicalSongsList[new Random().nextInt(classicalSongsList.length)];
    }

    @Override
    public void getGenre() {
        System.out.println("Classical Music");
    }
}

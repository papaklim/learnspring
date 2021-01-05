package ru.aklementev.springsimpleapp;

public class ClassicalMusic implements Music {

    public static ClassicalMusic getNewClassicalMusic() {
        return new ClassicalMusic();
    }

    public void myInitMethod() {
        System.out.println("Starting initialization method...");
    }

    public void myDestroyMethod() {
        System.out.println("Starting destruction method...");
    }

    @Override
    public void getSong() {
        System.out.println("Hungarian Rhapsody");
    }

    @Override
    public void getGenre() {
        System.out.println("Classical Music");
    }
}

package ru.aklementev.springsimpleapp;

public class RockMusic implements Music {

    @Override
    public void getSong() {
        System.out.println("Wind cries Mary");
    }

    @Override
    public void getGenre() {
        System.out.println("Rock Music");
    }
}

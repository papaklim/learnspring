package ru.aklementev.springsimpleapp;

import org.springframework.stereotype.Component;

@Component("RockMusicBean")
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
